package org.solved.OCP;

import org.solved.SRP.Solved_srp;

public class Solved_ocp {


    //create a base interface that calculators will implement
    //open for extension and closed for modification
    public interface PriceCalculationStrategy {
        double calculate(Solved_srp.Movie movie);
    }

    //a context class that will utilize the other Price calculation strategy
    //does not need to change to have new calculation methods
    //therefore it is open for extension and closed for modification

    public class PriceCalculator {
        private Solved_srp.Movie movie;

        public PriceCalculator(Solved_srp.Movie movie) {
            this.movie = movie;
        }

        // Method to calculate any price-related metric using the strategy pattern
        public double calculate(PriceCalculationStrategy strategy) {
            return strategy.calculate(movie);
        }
    }


    //extending the funcitonality
    public class PricePerMinuteCalculator implements PriceCalculationStrategy {
        @Override
        public double calculate(Solved_srp.Movie movie) {
            return movie.getPrice() / (movie.getlengthHours() * 60);
        }
    }

    // Price per hour calculation
    public class PricePerHourCalculator implements PriceCalculationStrategy {
        @Override
        public double calculate(Solved_srp.Movie movie) {
            return movie.getPrice() / movie.getlengthHours();
        }
    }

    // Discount calculation
    public class DiscountCalculator implements PriceCalculationStrategy {
        private double discountPercent;

        public DiscountCalculator(double discountPercent) {
            this.discountPercent = discountPercent;
        }

        @Override
        public double calculate(Solved_srp.Movie movie) {
            return movie.getPrice() * (discountPercent / 100);
        }
    }



}

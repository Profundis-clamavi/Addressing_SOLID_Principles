package org.violated.OCP;

import org.solved.SRP.Solved_srp;

public class Vio_ocp {



        //modifying the price calculator class from srp
        //breaking the open closed principle because we are modifying the class itself
        //everytime we want to add a new calculation we need to modify this class
        public class PriceCalculator{
            private Solved_srp.Movie movie;
            public PriceCalculator(Solved_srp.Movie movie) {
                this.movie = movie;
            }

            public double calcPricePerMinute(){
                return(movie.getPrice()/(movie.getlengthHours()*60));
            }

            //adding
            public double calcPricePerHour(){
                return(movie.getPrice()/(movie.getlengthHours()));
            }
            public double calcDiscountAmt(double discountPercent){
                return (movie.getPrice()/discountPercent);
            }


        }




}

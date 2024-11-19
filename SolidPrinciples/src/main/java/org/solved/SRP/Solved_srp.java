package org.solved.SRP;

public class Solved_srp {

    //made sure each class has one responsibility
    public class Movie{
        private double price;

        private double lengthHours;

        private String language;

        private String producer;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getlengthHours() {
            return lengthHours;
        }

        public void setlengthHours(double length) {
            this.lengthHours = length;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }
    }

    //took price calculator outside of movie
    public class PriceCalculator{
        private Movie movie;
        public PriceCalculator(Movie movie) {
            this.movie = movie;
        }

        public double calcPricePerMinute(){
            return(movie.getPrice()/(movie.getlengthHours()*60));
        }
    }

    //took description printing out of the movie class
    public class PrintMovieDescription{
        private Movie movie;
        public PrintMovieDescription(Movie movie) {
            this.movie = movie;
        }

        public void printDescription(){
            System.out.println("producer: "+movie.producer+"\n language: "+ movie.language+"\n Hours: " +movie.lengthHours);
        }
    }
}

package org.violated.SRP;

import java.sql.SQLOutput;

public class Vio_srp {

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



        //violates the single responsiblity principle
        //displaying content should not be in the same class as data storage
        public void printDescription(){
            System.out.println("producer: "+this.producer+"\n language: "+ this.language+"\n Hours: " +this.lengthHours);
        }

        //violates the single responsiblity principle
        //calculating values should be done in a different class
        public double calcPricePerMinute(){
            return (this.price/(this.lengthHours*60));
        }
    }

}


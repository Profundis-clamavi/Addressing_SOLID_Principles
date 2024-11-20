Addressing Solid Principles

Single Responsibility Principle:
  Why it is important:
    Following this principle will help facilitate managing the code. It makes the code smaller which makes it more space-      efficient. It also makes what the class does more clear.
    
  Violated:
    Created a Movie class that stores movie data as well as displays info about the movie and a calculate function.
    This does not follow SRP as it has multiple responsibilities.
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
  Solved:
    Broke the class into three smaller classes(Movie, PriceCalculator, PrintMovieDescription).
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
    

Addressing Solid Principles

Single Responsibility Principle:
  Why it is important:
    Following this principle will help facilitate managing the code. It makes the classes smaller which can make it more space-efficient. It also makes what the class does more clear.
    
  Violated:
    Created a Movie class that stores movie data as well as displays info about the movie and a calculate function.
    This does not follow SRP as it has multiple responsibilities.
    
  Solved:
    Broke the class into three smaller classes(Movie, PriceCalculator, PrintMovieDescription).
    
    

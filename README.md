Addressing Solid Principles



Single Responsibility Principle:

Why it is important:
Following this principle will help facilitate managing the code. It makes the classes smaller which can make it more space-efficient. It also makes what the class does more clear.
    
Violated:
Created a Movie class that stores movie data as well as displays info about the movie and a calculate function.
This does not follow SRP as it has multiple responsibilities.
    
Solved:
Broke the class into three smaller classes(Movie, PriceCalculator, PrintMovieDescription). This makes it so each class has only one responsibility.



Open/Closed Principle:

Why it is important:
It helps to make code more scalable as you don't have to change the class you can simply extend the functionality. This also helps keep the codebase more maintainable as you are not constantly changing code that works.

Violated:
Every time we want to add functionality to PriceCalculator we would have to modify PriceCalculator.

Solved:
We created a common interface that our new extra functionalities would implement.
We changed PriceCalculator to then use these classes to extend its functionality.
Therefore it no longer needs to change PriceCalculator to add functionality making it open for extension and closed for modification.



Interface Segregation Principle:
Why is it important:
It is important to have the interfaces be specific enough that the classes do not need to implement unnecessary logic. This can lead to more modular code.

Violated:
Icalculate has a variety of methods that may not nessacarily go together like triangulate and 


    
    
    

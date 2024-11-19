package org.violated.ISP;

public class Vio_isp {

    //violates the interface segragation principle
    //it has too many things that it requires you to implement
    public interface calculate{
        double add(int num, int num2);
         double subtract(int num, int num2);
         double multiply(int num, int num2);
         double power(int num, int num2);

         double triangulate(int num, double angle);


    }
}

package org.solved.ISP;

public class Solved_isp {


    //splits the interfaces up so you do not have to implement something you don't need
    
    public interface addition{
        double addition(double num, double num2);
    }
    public interface subtract{
        double subtract(double num, double num2);
    }
    public interface multiply{
        double multiply(double num, double num2);
    }
    public interface power{
        double power(int base, int power);
    }
    public interface triangulate{
        double triangulate(int num, double angle);
    }
}

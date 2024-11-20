package org.solved.ISP;

public class Solved_isp {


    //splits the interfaces up so you do not have to implement something you don't need
    
    public interface Iaddition{
        double addition(double num, double num2);
    }
    public interface Isubtract{
        double subtract(double num, double num2);
    }
    public interface Imultiply{
        double multiply(double num, double num2);
    }
    public interface Ipower{
        double power(int base, int power);
    }
    public interface Itriangulate{
        double triangulate(int num, double angle);
    }
}

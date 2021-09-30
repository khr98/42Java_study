package week1.test;

import week1.source.Calculate;

public class Test2 {
    public static void main(String[] args){
        Calculate cal = new Calculate(1, 5);

        cal.Add();
        cal.Sub();
        cal.Times();
        cal.Divide();
    }
}

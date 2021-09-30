package week1.source;

public class Calculate {
    static int a;
    static int b;

    public Calculate(int num1, int num2){
        a = num1;
        b = num2;
    }
    public void Add(){
        System.out.println(a+b);
    }
    public void Sub(){
        System.out.println(a-b);
    }
    public void Times(){
        System.out.println(a*b);
    }
    public void Divide(){
        System.out.println(a/b);
    }
}

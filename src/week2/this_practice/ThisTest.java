package week2.this_practice;

public class ThisTest {
    public static void main(String[] args){
        People me = new People("hyerkim", "female", 24);
        People other = new People("hyerim", 30);

        System.out.println(me);
        System.out.println(me.returnThis());
        if (me == me.returnThis()) {
            System.out.println("같은 인스턴스 입니다");
        }
        else{
            System.out.println("다른 인스턴스 입니다");
        }
        if (me == other.returnThis()) {
            System.out.println("같은 인스턴스 입니다");
        }
        else{
            System.out.println("다른 인스턴스 입니다");
        }
    }
}

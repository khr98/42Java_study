package week1.source;

public class People {
    String name;
    String gender;
    String married;
    int age;
    int child;

    public People(){
        this("X","X", "X", 0, 0);
    }
    public People(String name) {
        this(name, "여성", "기혼자", 30, 1);
    }
    public People(String name, String gender, String married, int age, int child){
        this.name = name;
        this.gender = gender;
        this.married = married;
        this.age = age;
        this.child = child;
    }

    public void print_info(){
        System.out.println("이름은 " + name + "이고 나이는" + age + "살 입니다.");
        System.out.println("성별은 " + gender + "이며," + married + " 입니다. 자녀는 " + child + "명이 있습니다");
    }
}

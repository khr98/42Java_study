package week2.this_practice;

public class People {
    String name;
    String gender;
    int age;

    public People(){
        this("null", "null", 0);
    }
    public People(String name){
        this(name, "null", 0);
    }
    public People(String name, String gender){
        this(name, gender, 0);
    }
    public People(String name, int age){
        this(name, "null", age);
    }
    public People(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public People returnThis(){
        return this;
    }
}

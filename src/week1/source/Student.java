package week1.source;

public class Student {
    String id;
    String name;
    int grade;

    public Student(String id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    public void print_student(){
        System.out.println("학번 : " + id);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade + "학년");
    }
}

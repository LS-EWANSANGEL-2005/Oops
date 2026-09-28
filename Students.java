package oops;

public class Students {

    String name;
    int age;
    String dept;

    void studying() {
        System.out.println(name + " is studying");
        System.out.println("Age: " + age);
        System.out.println("Department: " + dept);
    }

    void exam() {
        System.out.println(name + " is writing exam");
        System.out.println("Age: " + age);
        System.out.println("Department: " + dept);
    }

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = "Angel";
        s1.age = 21;
        s1.dept = "IT";

        Students s2 = new Students();
        s2.name = "Princy";
        s2.age = 18;
        s2.dept = "CSE";

        s1.studying();

        System.out.println();

        s2.exam();
    }
}
package oops;

public class Parametarized {

    String name;

    // Parameterized Constructor
    Parametarized(String name) {

        System.out.println("The Object is Created");

        this.name = name;
    }

    public static void main(String[] args) {

        Parametarized s = new Parametarized("Angel");

        Parametarized s1 = new Parametarized("Princy");

        System.out.println(s.name);

        System.out.println(s1.name);
    }
}
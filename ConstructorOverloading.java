package oops;

public class ConstructorOverloading {
	String name;
    int age;
    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }


    ConstructorOverloading(String name) {
        this.name = name;
        System.out.println("Object is created");
    }

	public static void main(String[] args) {
		ConstructorOverloading s1 = new ConstructorOverloading("Angel");

		ConstructorOverloading s2 = new ConstructorOverloading("Princy", 18);

		        System.out.println("s1 name: " + s1.name);
		        System.out.println("s2 name: " + s2.name);
		        System.out.println("s2 age: " + s2.age);
		    }
		}
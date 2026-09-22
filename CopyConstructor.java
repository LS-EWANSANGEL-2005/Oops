package oops;

public class CopyConstructor {

    String name;
    CopyConstructor(String name) {
        System.out.println("Object is created");
        this.name = name;
    }
    CopyConstructor(CopyConstructor obj) {
        this.name = obj.name;
    }
	public static void main(String[] args) {
		 CopyConstructor s1 = new  CopyConstructor("Angel");
		 CopyConstructor s2 = new  CopyConstructor(s1);

        System.out.println("s1 name: " + s1.name);
        System.out.println("s2 name: " + s2.name);
    }
}



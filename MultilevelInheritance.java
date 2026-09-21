package oops;
public class MultilevelInheritance {

public static void main(String[] args) {
		classA obj1=new classA();
		obj1.animal();
		classB obj2=new classB();
		obj2.flower();

	}
}
	class classA{
            void animal() {
            	System.out.println("Tiger is the animal");
            }
	}
	class classB extends classA{
		void flower() {
			System.out.println("Lotus is the flower");
		}
	}
	class classC extends classB{
		void fruits() {
			System.out.println("Mango is the fruits");
		}
	}
	class classD extends classA{
		void birds() {
			System.out.println("Dove is the birds");
		}
	}
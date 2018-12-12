package inheritance;

public class Test {

	public static void main(String[] args) {
	
		A a1 = new A();
		A.methodA1();
		a1.methodA();
		A.methodB1();
		A.methodC1();
		A.methodD1();
		 
		new E();
		E e2 = new E();
		e2.methodE();
		e2.methodA();
		
		
		B a2 = new A();
		a2.methodA();
		B.methodB1();
		B.methodC1();
		B.methodD1();
		
		new C();
		C.methodC1();
		D.methodD1();
		
		D c4 = new C();
		c4.methodA();
		D.methodD1();
		D.methodD1();

	}

}
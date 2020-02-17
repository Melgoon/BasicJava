package f_oop2.ex_abstract;

public abstract class Animal {
	
	void run(){
		System.out.println("달려간다~~~");
	}
	
	abstract void bark();
}
class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("멍멍!!");
		
	}
	
	
}
class cat extends Animal{

	@Override
	void bark() {
		System.out.println("야옹!!");
		
	}
	
}

class chkin extends Animal{

	@Override
	void bark() {
	System.out.println("삐약 삐약");
		
	}
	
}
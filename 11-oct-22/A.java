package oct11Assg;

class A {
	 void in() {
	 System.out.println("enter your name");}
 }
 class B extends A{
	 void show() {
		 System.out.println("my name is suchi");}

class c extends A{
	void disp() {
		 System.out.println("My name is suchitra");}

	}
class Base{
	
	public void main(String[] args) {
		B Re=new B();
		c Re2=new c();
		Re.in();
		Re.show();
		Re2.in();
		Re2.disp();
	}
}
 }

package config;

public class StaticandNotStatic {
	String name="Ashwin";
	static String Sex="Male";
	int age=12;
	static int weight=60;
	public static void main(String[] args) {
		//Calling static variable and methods
		//Method 1
		System.out.println(Sex);
		System.out.println(weight);
		size();
		
		//Method 2
		System.out.println(StaticandNotStatic.Sex);
		System.out.println(StaticandNotStatic.weight);
		StaticandNotStatic.size();
		
		//Calling Non static variable and methods
		StaticandNotStatic obj=new StaticandNotStatic();
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.name();
		
		
	/*	//Calling static variable and methods using object
				System.out.println(obj.Sex);
				System.out.println(obj.weight);
				obj.size();*/
	}
	
	public void name(){
		System.out.println("Hi... This is Ashwin");
	}
	public static void size(){
	System.out.println("Hi..Male Canidate");	
	}

}

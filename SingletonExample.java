package day02;

public class SingletonExample {
	public static void main(String ar[]){
		Singleton st1=Singleton.getInstance();
		Singleton st2=Singleton.getInstance();
		
		System.out.println(st1==st2); // true
		
		
		
		/*
		 SIngleton st3=new Singleton(); // 컴파일 에러 
		 */
	}
}

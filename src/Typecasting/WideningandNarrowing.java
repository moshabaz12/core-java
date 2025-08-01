package Typecasting;

public class WideningandNarrowing {

	public static void main(String[] args) {
		
	

		//Type casting in Java means changing one data type into another
		//it has 2 types
		//1. widening [implicit] (smaller type to a larger type Done automatically by Java (no need to write extra code))
		                 //int → long → float → double
		

		byte a=10;
		int b=a;
		float c=b;
		long d=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);	
		
		
//		Narrowing Casting (Explicit)
		//2. narrowing [explicit] (a larger type to a smaller type. You have to do it manually using a cast)
        // double → float → int → byte
		
		long e=3000;
		float f=(float)e;
		int g=(int)f;
		byte h=(byte)g;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);	
		System.out.println(h);
		
		
	}

}

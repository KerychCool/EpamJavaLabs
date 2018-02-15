public class lab2_4 {
	public static void main(String[] args) {
			float condt = 16.5f;
		DataOnly get = new DataOnly();
		System.out.println("From DataOnly: ");
		System.out.println("int i = " + get.i);
		System.out.println("float f = " + get.f);
		System.out.println("boolean b = " + get.b);
		
		
		float result = get.i * get.f;
		System.out.println("	i*f >= " + condt);
		if(result >= condt) {
			System.out.println("Result: " + result + " >= " + condt);
			get.b = true;
			System.out.println("It is " + get.b);
		}
		else {System.out.println(get.b + ". " + result + " > " + condt);}
		System.out.println(" ");
		System.out.println("get.b = " + get.b);
				
				
				
			DataOnly newget = new DataOnly();
			System.out.println("---");
				System.out.println("newget.b = " + get.b);
			if(get.b != newget.b) {System.out.println("	Incapsulation is here :) ");}
			
	}
}

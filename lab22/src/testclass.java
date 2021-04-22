import java.util.Scanner;

public class testclass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the radius ");
	    double radius = input.nextDouble();
		ComparableCircle j = new ComparableCircle(radius);
		
		System.out.println("Input the radius ");
	    double radius2 = input.nextDouble();
		ComparableCircle p = new ComparableCircle(radius2);
		
		
		
		if (j.compareTo(p)>0) 
			System.out.println(j + " j is larger");
		
		else if (j.compareTo(p)<0)
			System.out.println(p + " p is larger");
		
		else 
		System.out.println("They are the same");

				
		
	}

}

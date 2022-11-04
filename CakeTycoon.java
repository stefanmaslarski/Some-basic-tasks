import java.io.IOException;
import java.util.Scanner;

/*•	The number n – amount of cakes Ivancho wants.
•	The number c – kilograms of flour needed to make one cake.
•	The number f – kilograms of flour available.
•	The number t – amount of truffles available.
•	The number p – price of one truffle.8 */


public class CakeTycoon {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int t,p,f;
		
		long n;
		float c;
		System.out.println("Enter value for n = ");
		n = scanner.nextLong();
		System.out.println("Enter value for c = ");
		c = scanner.nextFloat();
		System.out.println("Enter value for f = ");
		f = scanner.nextInt();
		System.out.println("Enter value for t = ");
		t = scanner.nextInt();
		System.out.println("Enter value for p = ");
		p = scanner.nextInt();
				
		System.out.println("Entered value for n = " + n);
		System.out.println("Entered value for c = " + c);
		System.out.println("Entered value for f = " + f);
		System.out.println("Entered value for t = " + t);
		System.out.println("Entered value for p = " + p);
		
		float canDoPerDayMax = f/c;
		
		float canDoPerDayRounded = (float) Math.floor(canDoPerDayMax);
		float neededFlavor = n*c;
		float neededMore = neededFlavor - f;
		float priceofOneCake = (float) p;
		//Float priceofOneCakeIncreased25P =  (float) (0.25* p);
		long totalPriceForCakes =  t*p;
		double Devided = (double)((double)totalPriceForCakes/(double)n);
	
		float RealPriceOneCake =  (float) (1.25*Devided);
		
		System.out.println("Neded flavor/day = " + neededFlavor);
		
		if (canDoPerDayMax < n) {
			
			System.out.println("Can make only %canDoPerDayMax cakes," + canDoPerDayRounded); 
			System.out.println("Need %neededMore kg more flour" + neededMore); 
		} else {
			
			System.out.println("Can make %s wishes cakes," + n );
			System.out.println("Total price cakes," + totalPriceForCakes); 
			//int roundedCakes = Math.round(RealPriceOneCake,2);
			
			String result = String.format("%.2f", RealPriceOneCake);
			System.out.println("All products available, price of a cake: " +result); 
		};
		
	}

}

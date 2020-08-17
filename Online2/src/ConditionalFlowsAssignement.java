
import java.util.Scanner;

public class ConditionalFlowsAssignement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int KOTAK200 = 1, p;
		int ICICTREATS = 2;
		System.out.println("Enter the amount of paying for applicable of promocard :");
		double amountToPay = scanner.nextDouble();

		if (amountToPay >= 399) {
			System.out.println("You are elibile for applying Promo Code");
			System.out.println("1. KOTAK200 for orders above Rs.399. 20% Off Upto 200");
			System.out.println("2. ICICTREATS for orders above Rs.499. Flat 20%");
			// Suggesting the user to get the best discount offer
			double discount1 = 0.20 * amountToPay;
			if (amountToPay >= 399 & discount1 < 200)
				p = 1;
			else
				p = 2;
			if (p == 1)
				System.out.println("Choose option 1 ");
			else
				System.out.println(" Choose option 2 ");
			int promoCode = scanner.nextInt(); // either 1 or 2
			// 1 for KOTAK 200
			// 2 for ICICTREATS
			if (p == 2) {
				if (promoCode == ICICTREATS && amountToPay >= 499) {
					double discount = 0.20 * amountToPay;
					System.out.println("Promo Code ICICTREATS Applied. You Got Discount worth \u20b9" + discount);
					System.out.println("Please Pay: \u20b9" + (amountToPay - discount));
				}
			}
			if (p == 1) {
				if (promoCode == KOTAK200) {
					// Nested if/else
					double discount = 0.20 * amountToPay;
					if (discount > 200) {
						discount = 200;
					}
					System.out.println("Promo Code KOTAK200 Applied. You Got Discount worth \u20b9" + discount);
					System.out.println("Please Pay: \u20b9" + (amountToPay - discount));

				}

			}
		} else {
			System.out.println("You are NOT elibile for applying any Promo Code");
			System.out.println("Please Pay: \u20b9" + amountToPay);
		}
		scanner.close();
	}
}
// Assignment: 1. Suggest the User right promo code, if user has applied a
// wrong one
// 2. Suggest the User, promo Code which delivers highest discount
// 2.1 if user applied invalid promo code
// 2.2 if user has entered d a promo code which is giving him lesser
// discount as compare to other

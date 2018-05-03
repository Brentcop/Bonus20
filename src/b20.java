import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class b20 {
	public static void main(String[] args) {
		String a = " ";
		String userOrder;
		HashMap<String, Double> products = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		products.put("Gum", 0.95);
		products.put("Starburst", 1.95);
		products.put("Smoothie", 2.95);
		products.put("Apple", 0.92);
		products.put("Banana", 0.91);
		products.put("Cauliflower", 1.35);
		products.put("Oranges", 1.59);
		products.put("Grapes", 2.67);
		products.put("Water bottle", 1.95);
		products.put("Bread", 3.95);
		products.put("Pizza", 9.99);

		for (String product : products.keySet()) {
			//System.out.println(product + "		" + products.get(product));
		}
		ArrayList<String> orderList = new ArrayList<>();
		ArrayList<Double> priceList = new ArrayList<>();

		do {
			for (String product : products.keySet()) {
				System.out.println(product + "		" + products.get(product));
			}
			System.out.println("What item would you like to order?");
			userOrder = scan.nextLine();
			if (products.containsKey(userOrder)) {
				System.out.println(userOrder + "		" + products.get(userOrder));
				// products.putIfAbsent(userOrder, 5.55);
			} else {
				System.out.println("Hey product is non existant try again.");
			}
			// -add to order is not error

			orderList.add(userOrder);
			priceList.add(products.get(userOrder));
			// else handle error

			// prompt user to continue with order

			System.out.println("Would you like to contiue? (yes/no)");
			a = scan.nextLine();
		} while (a.equals("yes"));

		// display user order items and prices in columns
		for (int i = 0; i < orderList.size(); i++) {
			System.out.print(orderList.get(i) + "   ");
		}
		for (int i = 0; i < priceList.size(); i++) {
			System.out.println(priceList.get(i));
		}

		// display average of price of items ordered
		Double avgPrice = averagePrice(priceList);
		System.out.print("Average of items ordered : ");
		System.out.println(avgPrice);
		Double totPrice = totalPrice(priceList);
		System.out.print("Total of items ordered : ");
		System.out.println(totPrice);

		System.out.println(orderList);
		System.out.println(priceList);
		System.out.println("Goodbye");

	}

	public static Double averagePrice(ArrayList<Double> priceList) {
		Double sum = 0.0;
		for (int i = 0; i < priceList.size(); i++) {
			sum += priceList.get(i);
			sum = sum / (priceList.get(i));
		}

		return sum;

	}

	public static Double totalPrice(ArrayList<Double> priceList) {
		Double total = 0.0;
		for (int i = 0; i < priceList.size(); i++) {
			total += priceList.get(i);
		}
		return total;
	}

}

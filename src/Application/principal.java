package Application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class principal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of products: ");
		int number = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for (int i=1; i<=number; i++) {
			
			System.out.println("Product #" + i + " data");
			sc.nextLine();
			System.out.print("Common, used or imported? (c/u/i)");
			String option = sc.nextLine();
			
			if (option.charAt(0) == 'i') {
				
				System.out.println("Name: ");
				String productName = sc.nextLine();
				System.out.print("Price: ");
				double productPrice = sc.nextDouble();
				System.out.print("Customs fee: ");
				double productCFee = sc.nextDouble();
				Product product = new ImportedProduct(productName, productPrice, productCFee);
				list.add(product);
			}
			
			if (option.charAt(0) == 'c') {
				
				System.out.println("Name: ");
				String productName = sc.nextLine();
				System.out.println("Price: ");
				double productPrice = sc.nextDouble();
				Product product = new Product(productName, productPrice);
				list.add(product);
			}
			
			if (option.charAt(0) == 'u') {
				
				System.out.println("Name: ");
				String productName = sc.nextLine();
				System.out.println("Price: ");
				double productPrice = sc.nextDouble();
				sc.nextLine();
				System.out.println("Manufacture date (DD/MM/YYY): ");
				String productMDate = sc.nextLine();
				
				Product product = new UsedProduct(productName, productPrice, productMDate);
				list.add(product);
			}
			
		}
		
		System.out.println("Price tags:");
		for (Product pro : list) {
			System.out.println(pro.priceTag());
		}
		
		sc.close();
		
	}

}

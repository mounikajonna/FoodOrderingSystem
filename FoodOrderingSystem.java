package Assignment5;

import java.util.Scanner;

public class FoodOrderingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Swiggy Food Ordering System ");
		System.out.println("----------------------------------------------------------");
		System.out.println("Enter 1 to order the food");
		System.out.println("Enter 2 to view offers and combos");
		System.out.println("--------------------------------------");
		System.out.println("Enter your option: ");
        int choice = sc.nextInt();
        sc.nextLine(); 
        System.out.println("-------------------------------------");
        if (choice == 1) {
            System.out.println("Choose a cuisine to order from:");
            System.out.println("""
                    1) Indian
                    2) Chinese
                    3) Italian
                    4) Mexican
                    5) Continental
                    6) Thai
                    7) Desserts
                    8) Beverages
                    """);
            System.out.println("---------------------------------");
            System.out.println("Enter your option: ");
            int cuisineOption = sc.nextInt();
            sc.nextLine(); 
            String selectedCuisine = "";
            switch (cuisineOption) {
                case 1 -> selectedCuisine = "Indian";
                case 2 -> selectedCuisine = "Chinese";
                case 3 -> selectedCuisine = "Italian";
                case 4 -> selectedCuisine = "Mexican";
                case 5 -> selectedCuisine = "Continental";
                case 6 -> selectedCuisine = "Thai";
                case 7 -> selectedCuisine = "Desserts";
                case 8 -> selectedCuisine = "Beverages";
                default -> System.out.println("Enter a valid option");
            }

            if (!selectedCuisine.isEmpty()) {
                System.out.println("Select a restaurant offering " + selectedCuisine + " cuisine:");
                System.out.println("""
                        1) Biryani House
                        2) Golden Dragon
                        3) Pizza and Pasta Hub
                        4) Taco Fiesta
                        5) Gourmet Delight
                        6) Thai Spice
                        7) Sweet Cravings
                        8) Coffee Corner
                        """);
                System.out.println("---------------------------------");
                System.out.println("Enter your option: ");
                int restaurantOption = sc.nextInt();
                sc.nextLine();
                String selectedRestaurant = "";
                switch (restaurantOption) {
                    case 1 -> selectedRestaurant = "Biryani House";
                    case 2 -> selectedRestaurant = "Golden Dragon";
                    case 3 -> selectedRestaurant = "Pizza and Pasta Hub";
                    case 4 -> selectedRestaurant = "Taco Fiesta";
                    case 5 -> selectedRestaurant = "Gourmet Delight";
                    case 6 -> selectedRestaurant = "Thai Spice";
                    case 7 -> selectedRestaurant = "Sweet Cravings";
                    case 8 -> selectedRestaurant = "Coffee Corner";
                    default -> System.out.println("Enter a valid restaurant option");
                }

                if (!selectedRestaurant.isEmpty()) {
                    System.out.println("Select the dishes you want to order: ");
                    System.out.println("""
                            1) Chicken Biryani - ₹350
                            2) Veg Fried Rice - ₹250
                            3) Margherita Pizza - ₹400
                            4) Tacos (3 pcs) - ₹199
                            5) Paneer Butter Masala - ₹249
                            6) Thai Green Curry - ₹499
                            7) Chocolate Cake Slice - ₹299
                            8) Cold Coffee - ₹179
                            """);
                    System.out.println("---------------------------------");
                    System.out.println("Enter the dish numbers separated by commas: ");
                    String selectedDishes = sc.nextLine();

                    System.out.println("Enter the number of servings for each dish: ");
                    int servings = sc.nextInt();

                    int pricePerServing = 200; 
                    int totalAmount = servings * pricePerServing;

                    System.out.println("The total amount to be paid is: ₹" + totalAmount);
                    System.out.println("----------------------------------------");
                    System.out.println("Payment confirmation:");
                    System.out.println("1) Payment done");
                    System.out.println("2) Yet to be done");
                    int paymentConfirmation = sc.nextInt();

                    if (paymentConfirmation == 1) {
                        System.out.println("-------------------------------------------");
                        System.out.println("Here is your order summary:");
                        System.out.println("--------------------------------------------");
                        System.out.println("Cuisine: " + selectedCuisine);
                        System.out.println("Restaurant: " + selectedRestaurant);
                        System.out.println("Dishes: " + selectedDishes);
                        System.out.println("Servings: " + servings);
                        System.out.println("Total Amount Paid: ₹" + totalAmount);
                        System.out.println("Enjoy your meal!");
                    } else {
                        System.out.println("Payment is not completed. Please complete the payment to confirm your order.");
                    }
                }
            }
        } else if (choice == 2) {
            System.out.println("--------------------------------------------");
            System.out.println("Current Offers and Combos:");
            System.out.println("1) Buy 1 Get 1 Free on selected items!");
            System.out.println("2) 20% off on orders above ₹500.");
            System.out.println("3) Flat ₹100 cashback on payments via Swiggy Wallet.");
            System.out.println("4) Free dessert on orders above ₹1000.");
            System.out.println("--------------------------------------------");
        } else {
            System.out.println("Enter the correct option");
        }

        sc.close();
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    
	public static void main(String[] args) {
	    // TO-DO:
	    // Create an instance of the CafeUtil class 
        CafeUtil cafe = new CafeUtil();
	    // in order to use the CafeUtil class' methods.
    
	    // Hint: it will need to correspond with the variable name
	    // used in your test code.
    
	    // Given Test Cases Here

        // ******************** GET STREAK GOAL *************************
        System.out.println("----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n", cafe.getStreakGoal());

        
        // ******************** PRICE CHART *************************
        System.out.println("----- Price Chart Test-----");
        cafe.printPriceChart("Chai Latte Mix", 4.5, 3);
        cafe.printPriceChart("Specialty Coaster", 2.0, 5);


        // ******************** GET ORDER TOTAL *************************
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n",cafe.getOrderTotal(lineItems));


        // ******************** GET MENU *************************
        System.out.println("----- Display Menu Test-----");
        List<String> loadMenu = Arrays.asList( "drip coffee", "cappucino", "latte", "mocha" );
        List<Double> loadPrices = Arrays.asList(1.5, 3.5, 4.5, 3.5);
        ArrayList<String> menu = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();

        menu.addAll(loadMenu);
        prices.addAll(loadPrices);
        cafe.displayMenu(menu, prices);

                // ******************** ADD CUSTOMER *************************
        System.out.println("----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // Test 4 times
        for (int i = 0; i < 4; i++) { 
	        cafe.addCustomer(customers); 
	        System.out.println(customers);
            System.out.println("There are " + i + " customers ahead of you");
        }
	}

}

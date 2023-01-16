
public class profit {

	public static void main(String[] args) {
	    int[] riceStock = { 900, 1200, 1200, 1210 , 900, 750, 1050 };
	    int[] wheatStock = { 1100, 1900, 1500, 1500, 1500, 1500, 1400};
	    int[] cottonStock = { 200 , 700 , 300, 290, 600, 750, 350};
	    String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
	    int maxProfit = 0; 
	    
	    String mostProfitableStock = null;
	    String mostProfitableDay = null;

	    ///////////////////////////////////////////////////////////////////////////Rise calculation
	    int riceProfit = 0;
	    for (int i = 1; i < riceStock.length; i++) {
	        int dayProfit = riceStock[i] - riceStock[i-1];
	        riceProfit += dayProfit;
	        if (dayProfit > maxProfit) {
	            maxProfit = dayProfit;
	            mostProfitableStock = "Rice";
	            mostProfitableDay = days[i];
	        }
	        System.out.println("Rice profit on " + days[i] + ": " + dayProfit);
	    }
	    System.out.println("  ");
	    System.out.println("Total rice profit = " + riceProfit);
	    System.out.println("  ");
	    System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
	    System.out.println("  ");

	    ///////////////////////////////////////////////////////////////////////////Wheat calculation
	    int wheatProfit = 0;
	    for (int i = 1; i < wheatStock.length; i++) {
	        int dayProfit = wheatStock[i] - wheatStock[i-1];
	        wheatProfit += dayProfit;
	        if (dayProfit > maxProfit) {
	            maxProfit = dayProfit;
	            mostProfitableStock = "Wheat";
	            mostProfitableDay = days[i];
	        }
	        System.out.println("Wheat profit on " + days[i] + ": " + dayProfit);
	    }
	    System.out.println("  ");
	    System.out.println("Total wheat profit = " + wheatProfit);
	    System.out.println("  ");
	    System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
	    System.out.println("  ");

	    ////////////////////////////////////////////////////////////////////////////Cotton calculation
	    int cottonProfit = 0;
	    for (int i = 1; i < cottonStock.length; i++) {
	        int dayProfit = cottonStock[i] - cottonStock[i-1];
	        cottonProfit += dayProfit;
	        if (dayProfit > maxProfit) {
	            maxProfit = dayProfit;
	            mostProfitableStock = "Cotton";
	            mostProfitableDay = days[i];
	        }
	        System.out.println("Cotton profit on " + days[i] + ": " + dayProfit);
	    }
	    System.out.println("  ");
	    System.out.println("Total cotton profit = " + cottonProfit);
	    System.out.println("  ");
	    System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
	    System.out.println("  ");
	    
	    
	    
        //Highest Daily Profit
	    System.out.println("The most profitable DIALY stock was << " + mostProfitableStock + " >> with a profit of <<" + maxProfit+">> on " + mostProfitableDay);
	    System.out.println("  ");
	    
	    //Highest Total Profit
	    
	    if (riceProfit > wheatProfit && riceProfit > cottonProfit) {
	        System.out.println("<< Rice >> was the most WEEKLY profitable  with a profit of: " + riceProfit);
	    } else if (wheatProfit > riceProfit && wheatProfit > cottonProfit) {
	        System.out.println("<< Wheat >> was the most WEEKLY profitable with a profit of: " + wheatProfit);
	    } else {
	        System.out.println("<< Cotton >> was the most WEEKLY profitable with a profit of: " + cottonProfit);
	    }
	    
	}



}

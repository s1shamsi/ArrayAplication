
public class largeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int [] arr = new int [] {1, 2, 22, 2};  
	      
	        int max = arr[0];  
	
	        for (int i = 0; i < arr.length; i++) {  
	          
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("The largest number is = " + max);  
	    }  
	
	}



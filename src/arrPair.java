
import java.util.*; 
import java.io.*; 
public class arrPair{ 
    public static void main(String []args){ 
        Scanner sc = new Scanner(System.in); 
boolean con = true;
while (con) {
        int[] arr = {5, 3 , 2 , 6 , 15 , 15 ,10,1,4};
        System.out.println("Enter the value of the sum to be searched for: "); 
        int key = sc.nextInt(); 
 
        Arrays.sort(arr);
        
        int counter = arr.length; 
        
        for(int i = 0 ; i<arr.length; i++){ 
            if(arr[i] >= key){ 
                counter = i; 
                break; 
            } 
        } 
        for(int i=0; i<counter ;i++){ 
            for(int j=i+1; j<counter ;j++){ 
                if(arr[i]+arr[j] == key){ 
                    System.out.println("Pairs are: " + arr[i] +" "+ arr[j]); 
                } 
            } 
        }      
        System.out.println("");
System.out.println("Do you want to CHK another number, IF YES press 1 , IF NO press 2");
System.out.println("");
int chk = sc.nextInt();
if (chk != 1)
{
	con = false;
}
}
    }
} 
/*Rice Stock = { 900, 1200, 1200, 1210 , 900, 750, 1050 }
Wheat Stock = { 1100, 1900, 1500,1500, 1500, 1500, 1400}
Cotton Stock = { 200 , 700 ,300, 290,600,750,350}
Find the Stack which was most Profitable using Java?*/
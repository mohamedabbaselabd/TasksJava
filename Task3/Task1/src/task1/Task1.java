
package task1;
import java.util.*; 
public class Task1 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Size Of Array : ");
        int x = input.nextInt();
        int max;
        int []arr1= new int[x];
        for(int i = 0 ; i<arr1.length ; i++)
        {
            System.out.println("enter the value of Array ");
            arr1[i]=input.nextInt();
        }
        max=arr1[0];
        for(int i =0; i<arr1.length ; i++)
        {
            if(arr1[i]>max)
            {
                max=arr1[i];
            }
            
        }
        System.out.println("The Max Value in Array = "+max);
        
        
        
       
    }
    
}

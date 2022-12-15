
package task5;
import java.util.*;
public class Task5 {

   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter Your Sentence ");
        System.out.println("    ");
        String s = input.nextLine();
        System.out.println("The Sentence Is " + s);
        System.out.println("    ");
        String s1= s.replace(",", "");
        System.out.println("The New Sentence Is " + s1);
    }
    
}

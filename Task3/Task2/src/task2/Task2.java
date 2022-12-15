
package task2;
import java.util.*;
public class Task2 {
    public static void main(String[] args) 
    {
       Scanner input =new Scanner(System.in);
        
        
          System.out.println("Enter The Number Row   : ");
        int x = input.nextInt();
        System.out.println("Enter The Number Colum : ");
        int y = input.nextInt();
        double [][] m1 = new double[x][y];
        for (int row = 0 ; row <x ; row ++)
        {
            for ( int col=0 ; col<y ; col++ )
            {
                System.out.println("enter the value of row no " + (row+1) +" and col no " + (col+1));

                 m1[row][col]=input.nextInt();
            }
        }
         for (int row = 0 ; row <x ; row ++)
        {
            for ( int col=0 ; col<y ; col++ )
            {
                System.out.println(m1[col][row]);
            }
        }
       
       

    }
 
}


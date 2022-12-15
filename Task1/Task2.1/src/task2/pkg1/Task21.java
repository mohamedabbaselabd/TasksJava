package task2.pkg1;
import java.util.Scanner;
public class Task21 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The N : ");
        int n= input.nextInt();
        System.out.println("Enter The R : ");
        int r= input.nextInt();
        double npr,ncr;
        npr =  (factorial(n))/(factorial(n-r));
        ncr = npr/(factorial(r));
        System.out.println("npr ="+ npr);
        System.out.println("ncr ="+ ncr);
    }

    public static double factorial(double num)
    {
        int fact = 1;
        for (int i = 1; i <= num; i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    
}

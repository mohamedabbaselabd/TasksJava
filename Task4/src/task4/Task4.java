package task4;
import java.util.Scanner;

public class Task4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int x = scan.nextInt();
        int arr1 [] =new int[x], orderedNums[]=new int[x];
        int greater;
        

       
        System.out.println("Enter The Element Of Array  : ");
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(i+1+"=> ");
            arr1[i] = scan.nextInt();
        }
        System.out.println();

        
        for(int indexL=0;indexL<arr1.length;indexL++)
        {
            greater=0;
            for(int indexR=0;indexR<arr1.length;indexR++)
            {
                if(arr1[indexL]>arr1[indexR])
                {
                    greater++;
                }
            }
            orderedNums[greater]=arr1[indexL];
        }

       

        
       
            for(greater=0;greater<orderedNums.length;greater++)
            {
                System.out.print(orderedNums[greater]+" ");
            }
        
       
    }
}
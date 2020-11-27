import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr,int n) 
    {
        int p=0;
        int s=0;
        int z=0;
        //System.out.println(arr[0]);
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                p++;
            }
            else if(arr[i]<0)
            {
                s++;
            }
            else
            {
                z++;
            }
        }
            int v=n;
            //System.out.println(n);
            double plus=(p/v);
            double minus=(s/v);
            double zeros=(z/v);
            System.out.printf("%f",plus);
            //System.out.printf("%f",minus);
            //System.out.printf("%f",zeros);
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr,n);

        scanner.close();
    }
}
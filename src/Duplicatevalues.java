//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.Scanner;

public class Duplicatevalues {
    public static void main (String[] args)
    {
        System.out.println("Enter number of arrays");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter arrays");
        for (int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
//        int count=0;
        boolean duplicate = false;


        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j<arr.length;j++ )
            {
                if (arr[i]==arr[j])
                {
//                    count=count+1;
                    duplicate = true;
                    break;
                }

            }
        }
//        if (count>0)  Time complexity ghatauanh
        if (duplicate==true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }

}

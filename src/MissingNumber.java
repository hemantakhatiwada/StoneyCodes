//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of an array");
        int n= scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values in an array (there should be one missing number starting with 0)");
        int totalsum=0;
        int arrsum=0;
        for (int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();

            arrsum=arr[i]+arrsum;
        }
        totalsum=n*(n+1)/2;
        int missingnumber=arrsum-totalsum;
//        Arrays.sort(arr);
//        List<Integer> missingnumber = new ArrayList<>();
//        for (int i=0;i<n;i++)
//        {
//
//                if (i != arr[i]) {
//                    missingnumber.add(i);
//                }
//            }


        System.out.println("Missing number is : "+missingnumber);

    }
}

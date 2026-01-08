class Solutiontwosum {
    public int[] twoSum(int[] nums, int target)
    {
        for (int i=0;i<nums.length-1;i++)
        {
           for (int j=i+1;j<nums.length;j++)
           {
               if (nums[i]+nums[j]==target)
               {
                   return new int[]{i,j};
               }
           }
        }
        return new int[]{};
    }
}

public class Twosum {
    public static void main (String args[])
    {
Solutiontwosum obj = new Solutiontwosum();
int[] arr ={3,4,5,7,8};
int[]res=obj.twoSum(arr,15);
System.out.println(res[0]+" "+res[1]);
    }
}

import java.util.Arrays;
class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        // Arrays.sort(nums);
        
        for (int i=0;i<nums.length;i++)
        {
            int count=0;//count yaa bhitra use garo bhane fresh count hunxa for every numbers.
            for (int j=0;j<nums.length;j++)
            {
                if (nums[j]<nums[i])
                {
count=count+1;
                }
                
            }
             ans[i]=count;
        }
        return ans;
        
    }
}


public class Numbersmallerthancurrentnumber1365
{
    public static void main (String[] args)
    {
        Solution1365 obj = new Solution1365();
        int[] arr = { 2,3,8,9};
        int[] res= obj.smallerNumbersThanCurrent(arr);
       
       System.out.println(Arrays.toString(res));

    }
}
//448.Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int num: nums)
        {
            set.add(num);
        }
        int n=nums.length;
        for (int i=1;i<=n;i++)
        {
            if (!set.contains(i))
            {
                list.add(i);
            }
        }

        return list;
    }
}
public class nodisappearedinanarray448 {
    public static void main (String[] args)
    {
Solution obj = new Solution();
int[] arr = {3,4,5};

List<Integer> result=obj.findDisappearedNumbers(arr);
System.out.println(result);

    }
}

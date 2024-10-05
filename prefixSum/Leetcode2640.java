package prefixSum;

public class Leetcode2640 {
    class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long [] conver=new long[n];

    int max=nums[0];
        for(int i=0;i<n;i++){
            if(max < nums[i]) max=nums[i];
            conver[i]=nums[i]+max;

        }
        for(int i=1;i<conver.length;i++){
            conver[i]+=conver[i-1];
        }
        return conver;
    }


        
}
    
}

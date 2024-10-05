package prefixSum;

public class Leetcode724 {
    public static void main(String[] args) {
        class Solution {
            public int pivotIndex(int[] nums) {
                int n=nums.length;
                for(int i=0;i<nums.length;i++){
                    int leftSum=0,rightSum=0;
                    for(int j=0;j<i;j++){
                        leftSum+=nums[j];
                    }
                    for(int j=i+1;j<n;j++){
                        rightSum +=nums[j];
                    }
                    if(leftSum == rightSum) return i;
                }
             return -1;   
            }
        }


         //by using prefix sum

      for(int i=1;i<n;i++){
        nums[i]+=nums[i-1]    ;
    }
    for(int i=0;i<n;i++){
        int  leftSum=0;
        if(i>0) leftSum=nums[i-1];
        int rightSum= nums[n-1]-nums[i];
        if(leftSum==rightSum) return i;
    }

     return -1;
    }
    
}

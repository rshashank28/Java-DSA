package prefixSum;

public class Leetcode303 {
    public static void main(String[] args) {
        
        class NumArray {

            int[] arr;
            public NumArray(int[] nums) {
                arr=nums;
            }
            
            public int sumRange(int left, int right) {
                int sum =0;
                for(int i=left;i<=right;i++){
                    sum+=arr[i];
                }
                return sum;
            }
        }

        // tc for prefix sum array isO O(n)
        //tc for 'm' query O(m)
        //Tc for O(n+m)
        //Sc =O(n), 
        
    int[] arr;
    public NumArray(int[] nums) {
        // arr=nums;
        arr=Arrays.copyOf(nums,nums.length);
        for(int i=1;i<nums.length;i++){
            arr[i]+=nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)return arr[right];
      return arr[right]-arr[left-1];
    }
        
    }
}

class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0,l=0,temp=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                temp++;
            }
            while(temp>k){
                if(nums[l]==0){
                    temp--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
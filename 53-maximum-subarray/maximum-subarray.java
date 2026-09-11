class Solution {
    public int maxSubArray(int[] nums) {
        int c=0;
        int muxsum=Integer.MIN_VALUE;
        for(int s=0;s<nums.length;s++){
                c+=nums[s];
                muxsum=Math.max(c,muxsum);
                if(c<0){
                    c=0;
                }
            }
        
        return muxsum;
        
    }
}
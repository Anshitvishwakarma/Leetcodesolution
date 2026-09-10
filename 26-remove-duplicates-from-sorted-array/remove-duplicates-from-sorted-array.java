class Solution {
    public int removeDuplicates(int[] nums) {
     
        int n=nums.length;

        for (int i = 0; i < n ; i++) {
           for(int j=i+1;j<n;j++){
            if(nums[i]==nums[j]){
                for(int k=j;k<n-1;k++){
                    nums[k]=nums[k+1];
                }
                n--;
                j--;
            }
           }
        }
       int [] rss=new int [n];
        for (int i = 0; i < n ; i++) {
            rss[i]=nums[i];
        }
        return rss.length;

    }
}
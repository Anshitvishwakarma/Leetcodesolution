class Solution {
    public int searchInsert(int[] nums, int target) {
         TreeSet<Integer> map = new TreeSet<>();

        // Step 1: Count frequency
        for (int i = 0; i < nums.length; i++) {
           
                map.add(nums[i]);
  
         if (nums[i] >=target) {
            return i;
            }
      }
      return nums.length;
    }
}
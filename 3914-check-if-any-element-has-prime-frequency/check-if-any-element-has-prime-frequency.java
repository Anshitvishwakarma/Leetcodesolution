
import java.util.HashMap;

class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Step 2: Check whether any frequency is prime
        for (int key : map.keySet()) {
            int frequency = map.get(key);

            if (isPrime(frequency)) {
                return true;
            }
        }

        return false;
    }

    public boolean isPrime(int k) {
        if (k <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false;
            }
        }

        return true;
    }
}

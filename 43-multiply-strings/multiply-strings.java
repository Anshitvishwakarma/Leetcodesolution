class Solution {
    public String multiply(String num1, String num2) {
        // Handle edge case for zero
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        int m = num1.length();
        int n = num2.length();
        // The maximum possible length of the result is m + n
        int[] result = new int[m + n];
        
        // Multiply each digit from right to left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                
                // Position in the result array
                int p1 = i + j;
                int p2 = i + j + 1;
                
                // Add current multiplication to the existing value at position p2
                int sum = mul + result[p2];
                
                // Update positions
                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }
        
        // Build the final string from the array
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            // Skip leading zeros
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }
        
        return sb.toString();
    }
}

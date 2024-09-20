class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        int prefixProduct = 0;
        int suffixProduct = 0;
        int result = nums[0];

        for (int i=0; i<length; i++) {
            prefixProduct = (prefixProduct == 0 ? 1 : prefixProduct) * nums[i];
            suffixProduct = (suffixProduct == 0 ? 1 : suffixProduct) * nums[length - i - 1];
            result = Math.max(result, Math.max(prefixProduct, suffixProduct));
        }
        return result;
    }
}
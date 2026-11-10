class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preProd = new int[nums.length];
        preProd[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            preProd[i] = nums[i - 1] * preProd[i - 1];
        }

        int[] sufProd = new int[nums.length];
        sufProd[nums.length - 1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            sufProd[i] = nums[i + 1] * sufProd[i + 1];
        }

        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            output[i] = preProd[i] * sufProd[i];
        }

        return output;
    }
}  
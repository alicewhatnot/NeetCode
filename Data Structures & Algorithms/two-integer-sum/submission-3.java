
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // key: element, value: index
        HashMap<Integer, Integer> seenIntegers = new HashMap<>();
        int difference;

        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];
            if (seenIntegers.containsKey(difference)) {
                return new int[] {seenIntegers.get(difference),i};
            } else {
                seenIntegers.put(nums[i], i);
            }
        }

        return new int[] {-1,-1};
    }
}


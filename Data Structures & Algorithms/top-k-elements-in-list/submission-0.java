class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // number : frequency
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.merge(num, 1, Integer::sum);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> pair : frequencyMap.entrySet()) {
            if (buckets[pair.getValue()] == null) {
                buckets[pair.getValue()] = new ArrayList<>();
            }

            buckets[pair.getValue()].add(pair.getKey());
        }

        List<Integer> output = new ArrayList<>();

        for (int i = buckets.length - 1; i > 0 && output.size() < k; i--) {
            if (buckets[i] != null) {
                output.addAll(buckets[i]);
            }
        }

        return output.stream().mapToInt(i -> i).toArray();
    }
}
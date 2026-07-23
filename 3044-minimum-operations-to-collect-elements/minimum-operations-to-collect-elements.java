class Solution {
    public int minOperations(List<Integer> nums, int k) {

        int count = 0;
        int operations = 0;
        boolean[] seen = new boolean[k + 1];

        for (int i = nums.size() - 1; i >= 0; i--) {

            int num = nums.get(i);
            operations++;

            if (num <= k && !seen[num]) {
                seen[num] = true;
                count++;
            }

            if (count == k) {
                return operations;
            }
        }

        return operations;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int c = 0;
            int ac = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] == nums[i]) {
                    ac = 1;
                    break;
                }
            }
            if (ac == 0) {
                for (int k = i; k < n; k++) {
                    if (nums[i] == nums[k]) {
                        c++;
                    }
                }
            }
            if (c > n / 2) {
                return nums[i];
            }
        }
        return nums[0];
    }
}

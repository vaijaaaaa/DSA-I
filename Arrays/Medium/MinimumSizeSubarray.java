package Arrays.Medium;

public class MinimumSizeSubarray {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += nums[j];
                if(sum >= target) {
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}

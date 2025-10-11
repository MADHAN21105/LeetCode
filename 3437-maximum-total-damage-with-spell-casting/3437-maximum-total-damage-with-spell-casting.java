import java.util.*;

public class Solution {
    public long maximumTotalDamage(int[] power) {
        HashMap<Long, Long> freq = new HashMap<>();
        for (int p : power) freq.put((long)p, freq.getOrDefault((long)p, 0L) + 1L);
        List<Long> vals = new ArrayList<>(freq.keySet());
        Collections.sort(vals);
        int m = vals.size();
        long[] dp = new long[m + 1]; 
        for (int i = 0; i < m; ++i) {
            long v = vals.get(i);
            long takeValue = v * freq.get(v);
            int idx = lowerBound(vals, v - 2);
            dp[i + 1] = Math.max(dp[i], dp[idx] + takeValue);
        }

        return dp[m];
    }
    private int lowerBound(List<Long> list, long target) {
        int lo = 0, hi = list.size();
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (list.get(mid) >= target) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maximumTotalDamage(new int[]{1,1,3,4})); // 6
        System.out.println(s.maximumTotalDamage(new int[]{7,1,6,6})); // 13
    }
}

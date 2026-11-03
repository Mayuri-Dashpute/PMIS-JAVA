import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> groups = new HashMap<>();
        int largestSize = 0;

        for (int num = 1; num <= n; num++) {
            int digitSum = 0;
            for (int x = num; x > 0; x /= 10) {
                digitSum += x % 10;
            }

            int size = groups.getOrDefault(digitSum, 0) + 1;
            groups.put(digitSum, size);
            largestSize = Math.max(largestSize, size);
        }

        int count = 0;
        for (int size : groups.values()) {
            if (size == largestSize) {
                count++;
            }
        }

        return count;
    }
}
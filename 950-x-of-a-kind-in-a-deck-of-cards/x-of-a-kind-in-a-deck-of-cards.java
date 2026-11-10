
class Solution {

    public boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each card
        for (int num : deck) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int gcd = 0;

        // Find GCD of all frequencies
        for (int count : map.values()) {
            gcd = findGCD(gcd, count);
        }

        return gcd >= 2;
    }

    // Calculate GCD
    public int findGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}

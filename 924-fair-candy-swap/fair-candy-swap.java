class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA =0;
         int sumB =0;

         for(int x: aliceSizes){
            sumA += x;
         }

         for(int y: bobSizes){
            sumB += y;
         }

         int diff = (sumB-sumA)/2;
         HashSet<Integer> set = new HashSet<>();

         for(int y : bobSizes){
            set.add(y);
         }

         for(int x : aliceSizes){
            int target = x + diff;
            if(set.contains(target)){
                return new int[]{x,target};
            }
         }
        return new int[]{};
    }

}
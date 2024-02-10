class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>(candies.length);

        int max = 0;
        for(int i=0; i<candies.length;i++){
            max = candies[i] > max ? candies[i] : max;
        }

        for(int i=0; i<candies.length;i++){
            result.add(candies[i]+extraCandies >= max);
        }
        return result;
    }
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int val : candies) {
            if(val+extraCandies < max) {
                result.add(false);
            } else {
                result.add(true);
            }
        }
        return result;
    }
}
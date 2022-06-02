class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        return stones.length()-stones.replaceAll("["+jewels+"]", "").length();
    }
}
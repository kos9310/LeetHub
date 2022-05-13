class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] result = new int[len+len];
        System.out.println(result.length);
        System.arraycopy(nums, 0, result, 0, len);  
        System.arraycopy(nums, 0, result, len, len);
        return result;
    }
}
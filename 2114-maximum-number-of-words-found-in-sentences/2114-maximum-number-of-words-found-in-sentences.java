class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for(String str : sentences) {
            result = Math.max(result, str.split(" ").length);
        }
        return result;
    }
}
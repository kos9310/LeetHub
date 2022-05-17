class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for(String str : sentences) {
            result = result<str.split(" ").length?str.split(" ").length:result;
        }
        return result;
    }
}
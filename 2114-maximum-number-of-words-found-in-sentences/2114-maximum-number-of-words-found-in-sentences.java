class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = 0, len = 0;
        for(String str : sentences) {
            len = str.split(" ").length;
            result = result<len?len:result;
        }
        return result;
    }
}
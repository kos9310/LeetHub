class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for(int i=0; i<sentences.length; i++) {
            result = Math.max(result, sentences[i].split(" ").length);
        }
        return result;
    }
}
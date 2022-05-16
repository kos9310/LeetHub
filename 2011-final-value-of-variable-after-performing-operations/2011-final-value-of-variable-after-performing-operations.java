class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(String str : operations) {
            if(str.indexOf("+") >= 0) result++;
            else result--;
        }
        return result;
    }
}
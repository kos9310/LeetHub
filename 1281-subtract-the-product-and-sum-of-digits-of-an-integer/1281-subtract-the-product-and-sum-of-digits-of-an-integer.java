class Solution {
    public int subtractProductAndSum(int n) {
        int multiply = 1, sum = 0;
        char[] arr = String.valueOf(n).toCharArray();
        for(char ch : arr) {
            multiply *= ch-48;
            sum += ch-48;
        }
        return multiply-sum;
    }
}
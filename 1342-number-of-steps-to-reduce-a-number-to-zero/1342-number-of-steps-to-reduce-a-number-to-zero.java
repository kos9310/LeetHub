class Solution {
    public int numberOfSteps(int num) {
        int result = 0;
        while(num!=0) {
            num = num%2==1?--num:num/2;
            result++;
        }
        return result;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length(), cnt = 0, max = 0, start = -1;
        for(int i=0; i<len; i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                if(map.get(c) > start) {
                    cnt = i - map.get(c) - 1;
                    start = map.get(c);
                }
            }
            cnt++;
            map.put(c, i);
            if(max < cnt) {
                max = cnt;
            }
        }
        return max;
    }
}
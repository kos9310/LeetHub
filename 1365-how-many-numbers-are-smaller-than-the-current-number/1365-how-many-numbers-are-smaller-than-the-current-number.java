class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length), result = new int[nums.length];
        int idx = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Arrays.sort(arr);
        for(int i : arr) {
            if(map.get(i) == null) {
                map.put(i, idx++);
            } else {
                idx++;
            }
        }
        int i=0;
        for(int n : nums) {
            result[i++] = map.get(n);
        }
        return result;
    }
}
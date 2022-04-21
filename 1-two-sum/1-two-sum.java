class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++) {
            Integer val = (Integer) (target - nums[i]);
            if(map.containsKey(val)) {
                int[] result = {map.get(val), i};
                return result;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
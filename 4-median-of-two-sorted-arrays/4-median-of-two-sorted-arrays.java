class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = 0;
        double sum = 0.0;
        
        List<Integer> list1 = Arrays.stream(nums1).boxed().toList(); 
        List<Integer> list2 = Arrays.stream(nums2).boxed().toList();
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(list1);
        list.addAll(list2);
        
        list = list.stream().sorted().collect(Collectors.toList());
        size = list.size();
        sum = size%2==0?(double)(list.get(size/2-1)+list.get(size/2))/2:list.get(size/2);
        
        return (double)(sum);
    }
}
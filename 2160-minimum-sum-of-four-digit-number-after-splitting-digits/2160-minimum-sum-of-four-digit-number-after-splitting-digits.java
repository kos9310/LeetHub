class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(num/1000);
        list.add(num%1000/100);
        list.add(num%100/10);
        list.add(num%10);
        Collections.sort(list);
        return list.get(0)*10+list.get(1)*10+list.get(2)+list.get(3);
    }
}
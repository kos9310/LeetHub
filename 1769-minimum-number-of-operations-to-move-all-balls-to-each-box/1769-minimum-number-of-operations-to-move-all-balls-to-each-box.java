class Solution {
    public int[] minOperations(String boxes) {        
        List<Integer> result= new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<boxes.length(); i++) {
            if(boxes.charAt(i) == '1') {
                list.add(i);
            }
        }
        for(int i=0; i<boxes.length(); i++) {
            int sum = 0;
            for(int j=0; j<list.size(); j++) {
                if(i != list.get(j)) {
                    sum += Math.abs(i-list.get(j));
                }
            }
            result.add(sum);
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}
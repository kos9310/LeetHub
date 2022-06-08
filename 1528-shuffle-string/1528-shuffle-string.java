class Solution {
    public String restoreString(String s, int[] indices) {
        String result = "";
        List<Map<String, Object>> list = new ArrayList<>();
        for(int i=0; i<indices.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("indices", indices[i]);
            map.put("str", s.charAt(i));
            list.add(map);
        }
        Collections.sort(list, Comparator.comparingInt(p -> Integer.parseInt(p.get("indices").toString())));
        for(Map<String, Object> map : list) {
            result += map.get("str");
        }
        return result;
    }
}
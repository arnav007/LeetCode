class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            Integer s = map.get(arr[i]);
            map.put(arr[i], s==null?1:s+1);
        }
        
        Set<Integer> set = new HashSet(map.values());
        
        return set.size() == map.size();
    }
}
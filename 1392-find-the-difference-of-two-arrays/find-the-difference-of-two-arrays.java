class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();

        Set<Integer> s1 = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            s1.add(nums1[i]);
        }

        Set<Integer> s2 = new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            s2.add(nums2[i]);
        }


        List<Integer> l = new ArrayList<>();
        for(int i: s1){
            if(!s2.contains(i)){
                l.add(i);
            }
        }
        list.add(l);

        l = new ArrayList<>();
        for(int i: s2){
            if(!s1.contains(i)){
                l.add(i);
            }
        }
        list.add(l);

        return list;

    }
}
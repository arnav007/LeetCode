class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: words){
            map.put(s, map.getOrDefault(s,0)+1);
        }

        Queue<String> pQ =new PriorityQueue<>((s1,s2) ->{
                int c1 = map.get(s1);
                int c2 = map.get(s2);
                return (c1==c2 ? s2.compareTo(s1) : c1-c2);
            }        
        );

        Set<String> set = map.keySet();

        for(String s: set){
            pQ.offer(s);

            if(pQ.size() > k) pQ.poll();
        }

        List<String> result = new LinkedList<>();
        while(!pQ.isEmpty()){
            result.addFirst(pQ.poll());
        }
        return result;

    }
}
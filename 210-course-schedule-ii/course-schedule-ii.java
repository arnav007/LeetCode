class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];

        List<List<Integer>> adj= new ArrayList<List<Integer>>(numCourses);
        int[] linkCount= new int[numCourses];

        for(int i = 0 ; i< numCourses; i++){
            adj.add(i, new ArrayList<Integer>());
        }

        for(int[] link: prerequisites){
            adj.get(link[1]).add(link[0]);
            linkCount[link[0]]++;
        }
        
        //BFS
        Queue<Integer> toVisit = new ArrayDeque<Integer>();
        for(int i=0; i< linkCount.length; i++){
            if(linkCount[i] == 0) toVisit.add(i);
        }

        int c = 0;
        while(!toVisit.isEmpty()){
            int start = toVisit.poll();
            result[c++] = start;

            for(int next: adj.get(start)){
                linkCount[next]--;

                if(linkCount[next] == 0) toVisit.add(next);
            }
        }

        return (c == numCourses)? result : new int[0];
    }
}
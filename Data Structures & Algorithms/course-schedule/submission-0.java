class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      List<List<Integer>> adj= new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] indeg=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        // [1,0] 0→1
        for(int[] pre:prerequisites){
            adj.get(pre[1]).add(pre[0]);
            indeg[pre[0]]++;

        }

        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        


        // s3 transverse q
        List<Integer> topo=new ArrayList<>();
        while(!q.isEmpty()){
            int node= q.poll();
            topo.add(node);
            for(int neigh:adj.get(node)){
                indeg[neigh]--;
                if(indeg[neigh]==0){
                    q.add(neigh);
                }
            }
        }
        if(topo.size()!=numCourses){
            return false;
        }
        // int[] res = new int[numCourses];
        // for (int i=0;i<numCourses;i++){
        //     res[i]=topo.get(i);
        // }
        return true;  
    }
}

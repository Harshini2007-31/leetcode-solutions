class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n=parent.length;
        int[]depth=new int[n];
        depth[0] =1;
        int height =1;
        for(int i=1;i<n;i++){
            int current =i;
            while(depth[current]==0){
                current=parent[current];
            }
            int d=depth[current];
            current=i;
            while(depth[current]==0){
                depth[current]=++d;
                current=parent[current];
            }
            height=Math.max(height,depth[i]);
    }
    long answer=0;
    for(int i=0;i<n;i++){
        answer+=(long)nums[i]*(height - depth[i]+1);
    }
    return answer;
}
}
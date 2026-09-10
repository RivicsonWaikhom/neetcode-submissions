class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int p0=1;
        int p1=2;
        for(int i=3;i<n+1;i++){
            int temp=p0+p1;
            p0=p1;
            p1=temp;
        }
        return p1;
        
    }
}
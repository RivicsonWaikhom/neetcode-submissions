class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0,tcost=0;
        for(int i=0;i<gas.length;i++){
            tgas+=gas[i];
            tcost+=cost[i];
        }
        if(tgas<tcost)return -1;
        // check sp with help of remain_gas
        int sp=0;
        int rgas=0;
        for(int i=0;i<gas.length;i++){
            rgas=gas[i]-cost[i];
            if(rgas<0){
                rgas=0;
                sp=i+1;
            }
        }
        return sp;
    }
}

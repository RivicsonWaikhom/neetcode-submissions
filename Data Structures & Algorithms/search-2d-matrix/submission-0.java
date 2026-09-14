class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length, col=matrix[0].length;
        int top=0;
        int bottom =row-1;
        int vrow=-1;

        // find correct row
        while(top<=bottom){
            int mid=top+(bottom-top)/2;
            if(matrix[mid][0]<=target && target <=matrix[mid][col-1]){
                vrow=mid;
                break;
            }
            else if(matrix[mid][0]>target){
                bottom=mid-1;
            }
            else{
                top=mid+1;
            }
        }
        if(vrow==-1) return false;
        
        // now we check if valid row has our target
        int s=0, e=col-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(matrix [vrow] [mid]== target){
                return true;
            }
            else if(matrix[vrow][mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
}

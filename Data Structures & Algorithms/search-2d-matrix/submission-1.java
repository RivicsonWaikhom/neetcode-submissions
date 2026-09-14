class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length,n=matrix[0].length;
        // n= element in row[i]
        if(m==0) return false;
        int start=0,end=m*n-1;
        while(start<= end){
            int mid=start+(end-start)/2;
            int guess= matrix [mid/n][mid % n];
            if(target== guess){
                return true;
            }else if(target>guess){
                start=mid+1;
            }
            else {
                end= mid-1;
            }
        }
        return false;
    }
}
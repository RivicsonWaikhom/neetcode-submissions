class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;

        // Ensure nums1 is the smaller array for simplicity
        if (m > n) return findMedianSortedArrays(nums2, nums1);
        int s=0,e=m;
        while(s<=e){
            int partitionS= (s+e)/2;
            int partitionL=(m+n+1)/2-partitionS;
            int l1=partitionS==0?Integer.MIN_VALUE:nums1[partitionS-1];
            int l2=partitionL==0?Integer.MIN_VALUE:nums2[partitionL-1];
            
            int r1=partitionS==m?Integer.MAX_VALUE:nums1[partitionS];
            int r2=partitionL==n?Integer.MAX_VALUE:nums2[partitionL];

            if(l1<=r2 && l2<=r1){
                return (m+n)%2==0?(Math.max(l1,l2)+Math.min(r1,r2))/2.0:Math.max(l1,l2);
            }
            if(l1>r2) e=partitionS-1;
            else s=partitionS+1;   

        }
        return 0;
    }
}

/*
// class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length,n=nums2.length;
        double[] a=new double[m+n];
        for( int i=0;i<nums1.length;i++){
            a[i]=nums1[i];
        }
        int s=0;
        for( int i=nums1.length;i<nums1.length+nums2.length;i++){
            a[i]=nums2[s];
            s++;
        }
        Arrays.sort(a);
        int i=(m+n)/2;;
        if((m+n)%2!=0){
            return a[i];
        }else{
            // i=(m+n)/2;
            return (a[i]+a[i-1])/2;
        }
        

    }
}
*/

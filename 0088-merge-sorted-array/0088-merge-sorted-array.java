class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=n-1;
        int j=m-1;
        int pos=m+n-1;

        while(i>=0){
            if(j<0){
                nums1[pos] = nums2[i];
                i--;
            } else if(nums2[i] > nums1[j]){
                nums1[pos] = nums2[i];
                i--;
            } else{
                nums1[pos] = nums1[j];
                j--;
            }
            pos--;
        }
    }
}
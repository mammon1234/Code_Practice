public class Solution {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int [] searchRange = new int[]{-1,-1};
        if( A == null || A.length == 0){
            return searchRange;
        }
        int start, mid, end;
        // find the left bound
        start = 0;
        end = A.length - 1;
        while( start + 1 < end){
            mid = start + (end - start)/2;
            if( A[mid] >= target){
                end = mid;
            }else {
                start = mid;
            }
        }
        if(A[start] == target ){
            searchRange[0] = start;
        }else if( A[end] ==  target ){
            searchRange[0] = end;
        }else{
            return searchRange;
        }
        // find the right bound
        start = 0;
        end = A.length - 1;
        while( start + 1 < end){
            mid = start + (end - start)/2;
            if( A[mid] <= target){
                start = mid;
            }else {
                end = mid;
            }
        }
        if(A[end] == target ){
            searchRange[1] = end;
        }else if( A[start] ==  target ){
            searchRange[1] = start;
        }
        return searchRange;
    }
}

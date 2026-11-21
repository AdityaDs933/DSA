/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l=0;
        int h=mountainArr.length()-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                l=mid+1;
            }else{
                h=mid;
            }
        }
        int peak=l;
        l=0;
        int high=peak;
        while(l<=high){
            int mid=l+(high-l)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }else if(mountainArr.get(mid)<target){
                l=mid+1;
            }else{
                high=mid-1;
            }
        }
        int a=peak+1;
        int b=mountainArr.length()-1;
        while(a<=b){
            int mid=a+(b-a)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }else if(mountainArr.get(mid)>target){
                a=mid+1;
            }else{
                b=mid-1;
            }
        }
        return -1;
    }
}
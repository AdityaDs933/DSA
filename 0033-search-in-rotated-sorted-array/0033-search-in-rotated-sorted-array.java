class Solution {
    public int search(int[] arr, int target) {
        int l=0;
        int high=arr.length-1;
        while(l<high){
            int mid=l+(high-l)/2;
            if(arr[mid]>arr[high]){
                l=mid+1;
            }else{
                high=mid;
            }
        }
        int peak=l;
        l=0;
        high=peak-1;
        while(l<=high){
            int mid=l+(high-l)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                l=mid+1;
            
            }
            else{
                high=mid-1;
            }
        }
        l=peak;
        int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                l=mid+1;
            }  else{
                h=mid-1;
            }
        }
        return -1;
    }
}
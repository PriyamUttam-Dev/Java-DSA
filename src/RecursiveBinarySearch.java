public class RecursiveBinarySearch {

    static int searchBS(int[] arr , int  target , int start , int  end ){
        int mid = start + (end - start ) / 2;
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return searchBS(arr,target,start , mid-1);
        }
        else{
            return searchBS(arr,target,mid+1,end);
        }

    }
    public static void main (String[] args){
        int[] arr = {1,4,5,6,8,10};
        int target = 8;
        System.out.println(searchBS(arr,target,0,(arr.length-1)));
    }
}

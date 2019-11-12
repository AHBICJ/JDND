public class BinarySearch {
    public static int findTarget(int[] arr, int target) {
        if (arr.length == 0) return -1;
        int lb=0,ub=arr.length;
        while (ub-lb>1){
            int mid = lb + (ub - lb) /2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                ub = mid;
            } else{
                lb = mid;
            }
        }
        if (target == arr[lb]) return lb;
        return -1;
    }
}

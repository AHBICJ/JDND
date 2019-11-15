public class BinarySearch {
    /*
    [ )
    */
    public static int findTarget(int[] arr, int target) {
        if (arr.length == 0) return -1;
        // lower_bound,upper_bound
        int lb = 0, ub = arr.length;
        while (lb < ub) {
            int mid = lb + (ub - lb) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                ub = mid;
            } else {
                lb = mid + 1;
            }
        }
        return -1;
    }

    /*
    [ ]
    */
    public static int findTarget2(int[] arr, int target) {
        if (arr.length == 0) return -1;
        int lb = 0, ub = arr.length - 1;
        while (lb <= ub) {
            int mid = lb + (ub - lb) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                ub = mid - 1;
            } else {
                lb = mid + 1;
            }
        }
        return -1;
    }
}

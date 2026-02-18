package Searching;

public class Linearsearch {
    public static void main(String[] args) {
        int[] nums = {23, 24, 1, 2, 3, 5, 6, 78, 91};
        int element = 91;
        int ans = lisearch(nums, element);
        
        System.out.println("Element found at index: " + ans);
    }

    // search in the array: return the index if item found
    static int lisearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (target == element) {
                return i;
            }
        }
        return -1; // if not found
    }
}

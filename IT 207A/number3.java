//0(Log n)-Lograrithmic Time: FIND A SPECIFIC VALUE IN A SORTED ARRAY. [1, 3, 5, -3, 9, -6, 10, 11, 30, 16] 

public class number3 {

    public static void main(String[] args) {
        int myArray[] = { 1, 3, 5, -3, 9, -6, 10, 11, 30, 16 };
        java.util.Arrays.sort(myArray);
        int num = 10;
        int result = binarySearch(myArray, num, 0, myArray.length - 1);
        if (result == -1)
            System.out.println(num + " is not present in array");
        else
            System.out.println(num + " is present at index " + result);
    }

    public static int binarySearch(int arr[], int x, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, x, low, mid - 1);

            // Else the element can only be present in right subarray
            return binarySearch(arr, x, mid + 1, high);
        }

        return -1;
    }
}
//0(Log n)-Lograrithmic Time: FIND A SPECIFIC VALUE IN A SORTED ARRAY. [1, 3, 5, -3, 9, -6, 10, 11, 30, 16] 

public class number3 {

    public static void main(String[] args) {
        int myArray[] = { 1, 3, 5, -3, 9, -6, 10, 11, 30, 16 };
        int target = 9;
        int index = (myArray, target, 0, myArray.length - 1);
        
        if (index == -1) {
            System.out.println(target + " not found in the array");
        } else {
            System.out.println(target + " found at index " + index);
        }
    }
}

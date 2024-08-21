// 0(n)- LINEAR TIME: FIND THE LARGEST VALUE IN AN ARRAY.

public class number2 {

    public static void main(String[] args) {
        int myArray[] = { 1, 3, 5, -3, 9, -6, 10, 11, 30, 16 };
        int max = myArray[0];
        
        for (int i = 1; i < 10; i++) {
            if (myArray[i] > max) { 
                max = myArray[i];
            }
        }
            System.out.println("The largest number in the array is "  +  max);
    }
}



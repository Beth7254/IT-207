// 0(n)- CONSTAN TIME : FIND A SPECIFIC VALUE IN AN ARRAY.

public class number1 {
    public static void main(String[] args) {
        int myArray[] = { 1, 3, 5, -3, 9, -6, 10, 11, 30, 16 };
        int num = 10 ;

        for (int i = 0; i < 10; i++) {
            if (myArray[i] == num) {
                System.out.println( num + " is in index " + i );
                break;
            }
        }
    }
}


class number {
    public static void main(String[] args) {
        int myArray[] = { 3, 1, 5, 10, -3, -1, 20, 30, 15, 10 };
        int num = 20;

        for (int i = 0; i < 10; i++) {
            if (myArray[i] == num) {
                System.out.println( num + " is in index " + i );
                break;
            }
        }
    }
}

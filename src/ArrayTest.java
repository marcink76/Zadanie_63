public class ArrayTest {
    public static void main(String[] args) {
        int[][] arrayA = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
        int[][] arrayB = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};

        System.out.println(ArrayComparator.arrayComparator(arrayA, arrayB));
    }
}

public class ArrayComparator {

    public static boolean arrayComparator(int[][] arrayA, int[][] arrayB) {
        if (arrayA.length == arrayB.length && arrayA[0].length == arrayB[0].length) {

            for (int i = 0; i < arrayA.length; i++) {
                for (int j = 0; j < arrayA[0].length; j++) {
                    if (arrayA[i][j] != arrayB[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        } else return false;
    }
}

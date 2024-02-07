package ag.code.ujic;

// merge 2 sorted arrays into sorted array
// don't use JDK methods like Arrays.sort

import java.util.Arrays;

public class TwoSortedArraysMerger {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 5, 7};
        int[] array2 = new int[]{2, 4, 6};

        int[] result = mergeTwoSortedArrays(array1, array2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeTwoSortedArrays(int[] array1, int[] array2) {

        int length1 = array1.length;
        int length2 = array2.length;

        if (length1 == 0) {
            return array2;
        }

        if (length2 == 0) {
            return array1;
        }

        int resultSize = length1 + length2;
        int[] result = new int[resultSize];

        int curPos1 = 0;
        int curPos2 = 0;

        for (int i = 0; i < resultSize; i++) {

            if (array1[curPos1] <= array2[curPos2]) {
                result[i] = array1[curPos1];
                curPos1++;
                if (curPos1 == length1) {
                    copyTheRestOfTheLeftArray(array2, curPos2, result, curPos1);
                    break;
                }
            } else {
                result[i] = array2[curPos2];
                curPos2++;
                if (curPos2 == length2) {
                    copyTheRestOfTheLeftArray(array1, curPos1, result, curPos2);
                    break;
                }
            }

        }

        return result;
    }

    private static void copyTheRestOfTheLeftArray(int[] longestArray, int from, int[] result, int resultPosition) {
        for (int j = from; j < longestArray.length; j++) {
            result[resultPosition + j] = longestArray[j];
        }
    }

}

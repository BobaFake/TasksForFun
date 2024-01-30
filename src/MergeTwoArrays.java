import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {1,4,5};
        int[] b = {8,12,5,9};

        int[] merged = mergeTwoArray(a,b);
        System.out.println(Arrays.toString(merged));

    }

    public static int[] mergeTwoArray(int[] n, int[] m) {
        int[] merged = new int[n.length + m.length];

        for (int i = 0; i < n.length; i++) {
            merged[i] = n[i];
        }
        for (int j = 0; j < m.length; j++) {
            merged[j + n.length] = m[j];
        }

        return merged;
    }

}
 /*
        Concat Arrays

        Create a method that will take two int arrays and concat them into one array. Concat the arrays by combining them into one array

        Ex:
            Input:
                [1, 4, 5], [8, 12, 5, 9]
            Output:
                [1, 4, 5, 8, 12, 5, 9]
     */
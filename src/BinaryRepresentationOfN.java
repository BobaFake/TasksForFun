import java.util.Arrays;

public class BinaryRepresentationOfN {
    public static void main(String[] args) {

        int n = 6;
        System.out.println(binary(20));

    }
    public static int binary(int n) {
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        String[] array = binary.split("");
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (String s : array) {
            if (s.equals("1")) {
                count++;
            }
        }
        return count;
    }
}
/*
        Binary Representation Of N

        Create a method to determine how many 1s are in the representation of the number in binary form
            parameter: int
            return: int

            The given n will be more than 0

        Ex:
            input: 6
            output: 2

            6 in binary is 110
            there are two '1' digits, so the output is 2

        Test data:
            6 -> 110 -> 2
            7 -> 111 -> 3
            4 -> 100 -> 1
            10 -> 1010 -> 2
            15 -> 1111 -> 4
            16 -> 10000 -> 1
     */

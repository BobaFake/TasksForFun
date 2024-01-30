public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {3,5,1,5,-1,5};

        System.out.println(maxNum(numbers));
    }

    public static int maxNum(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }

        return max;
    }
}
 /*
        Max Number

        Create a method that will find and return the max number in an int array
            parameter: int[]
            return: int

        The max number is the biggest value in the array

        Ex:
            input:
                max(3, 5, 1, 5, -1, 5)
            output:
                5
     */
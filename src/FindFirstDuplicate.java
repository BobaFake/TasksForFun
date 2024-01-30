public class FindFirstDuplicate {
    public static void main(String[] args) {
        int[] numbers0 = {3, 5, 1, 5, -1, 5, 3};
        int[] numbers1 = {5, 1, 5, -1, 5, 3};
        int[] numbers2 = {5, 1, -1, 3};
        int[] numbers3 = {5, 1, 5, -1, 5, 3};

        System.out.println(firstDuplicateElement(numbers0));
        System.out.println(firstDuplicateElement(numbers1));
        System.out.println(firstDuplicateElement(numbers2));
        System.out.println(firstDuplicateElement(numbers3));

    }

    public static int firstDuplicateElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

}
 /*
        First Duplicate Element

        Create a method that will find and return the first duplicate element
            parameter: int[]
            return: int
                if no duplicate elements are found return 0

        A duplicate element is when the number can be found multiple times in the array

        Ex:
            input:
                findDup(3, 5, 1, 5, -1, 5, 3)
            output:
                3

                -> 3 is the first duplicate found
     */
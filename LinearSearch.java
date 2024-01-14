public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 15, 32, 14, 67, 51, 39 };
        int key = 51;
        int index = searchValue(arr, key);
        if (index == -1) {
            System.out.println("The index does not exist.");
        } else {
            System.out.println("The required index is : " + index + " and the value is : " + arr[index]);
        }

    }

    public static int searchValue(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }
}

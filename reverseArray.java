
public class reverseArray {

    public static void main(String[] args) {
        
        int [] arr = {2, 4, 6, 8, 10};
        reverseArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
    public static void reverseArr(int[]arr){

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        
        // int low = 0;
        // int high = arr.length -1;

        // while(low < high){
        //     int temp = arr[low];
        //     arr[low] = arr[high];
        //     arr[high] = temp;
            
        //     low++;
        //     high--;
        // }

    }
}
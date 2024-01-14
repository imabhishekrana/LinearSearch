public class findMax {
    public static void main(String[] args) {
        int [] arr = {1,43,24,66,234,21};
        
        System.out.println(getMax(arr));
        
    }
    public static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        return max;
    }
}

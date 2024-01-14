public class functionArgs {
    public static void main(String[] args) {

        // array is call by refernce
        int[] arr = {98, 99, 95, 93};

        // call by value
        int nonChangeable = 5;
        update(arr, nonChangeable);
        
        System.out.println(nonChangeable); // prints 5 only
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void update(int[] marks, int nonChangeable){
        nonChangeable = 10;
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
}

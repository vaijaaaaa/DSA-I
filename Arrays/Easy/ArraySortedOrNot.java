package Arrays;

public class ArraySortedOrNot {
    public static boolean isArraySorted(int[] arr) {
        for(int i =1 ;i< arr.length;i++)
        {
            if(arr[i] > arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        int arr [] = {1,2,4};
        System.out.println(isArraySorted(arr));
    }
}

package Medium;

import java.util.Arrays;

public class TwoSum {

    static String twosum(int [] arr, int target){
        int n = arr.length;
        Arrays.sort(arr);
        int left=0;
        int rigth = n-1;
        while (left<rigth) {
            int sum = arr[left] + arr[rigth];
            if(sum == target){
                return "YES";
            }
            else if(sum < target) left++;
            else{
                rigth--;
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        int arr [] = {2,6,5,8,11};
        int target = 14;
        String ans = twosum(arr, target);
        System.out.println(ans);
    }
}

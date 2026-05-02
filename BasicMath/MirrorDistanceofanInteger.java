package BasicMath;

public class MirrorDistanceofanInteger {
      public int mirrorDistance(int n) {
        int reverse = 0;
        int original = n;
        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return Math.abs(original-reverse);
    }
}

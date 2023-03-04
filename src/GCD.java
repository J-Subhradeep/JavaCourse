public class GCD {
    public static int calculate(int x, int y){
        int z=1;

        for (int i = Math.min(x,y); i >= 1; i--) {
            if(x%i==0  && y%i==0){
                return i;
            }
        }
        return  z;
    }
}

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int k = 5-i; k >0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {

                System.out.print("* " );
            }
            System.out.println();
        }
        System.out.println("Square of 2: "+ new Functions().square(4));
        System.out.println("GCD of 8 and 12 :" + new GCD().calculate(24, 36));
    }
}
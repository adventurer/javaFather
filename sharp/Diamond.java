package sharp;
/**
 * Diamond
 */
public class Diamond {

    public static void main(String[] args) {
        printDiamond(8);
    }

    private static void printDiamond(int count) {
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < count-i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println("\r\n");
        }
    }
}

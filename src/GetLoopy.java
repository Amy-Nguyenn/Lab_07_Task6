public class GetLoopy {
    public static void main(String[] args) {
        System.out.println("Task 6:");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
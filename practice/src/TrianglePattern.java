public class TrianglePattern {
    public static void main(String[] args) {
        int i;
        int j;
        int n = 8;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}





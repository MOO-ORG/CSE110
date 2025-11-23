public class QS4_Tracing {
    public static void main(String[] args) {
        int n1 = 184;
        int n2 = 24;
        int n3 = 56;
        while (!((n1 == n2) && (n2 == n3))) {
            if (n1 > n2) {
                if (n2 > n3) {
                    n1 -= n2;
                    System.out.println(n1);
                } else {
                    if (n1 > n3) {
                        n1 -= n3;
                        System.out.println(n1);
                    } else {
                        n3 -= n1;
                        System.out.println(n3);
                    }
                }
            } else {
                if (n2 > n3) {
                    if (n1 > n3) {
                        n2 -= n1;
                        System.out.println(n2);
                    } else {
                        n2 -= n3;
                        System.out.println(n2);
                    }
                } else {
                    n3 -= n2;
                    System.out.println(n3);
                }
            }
        }
        System.out.println(n1);
    }
}

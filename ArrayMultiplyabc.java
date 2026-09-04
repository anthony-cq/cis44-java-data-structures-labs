public class ArrayMultiplyabc {
    public static void main(String[] args) {
        int n = 5;

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 5) + 1;
            b[i] = (int) (Math.random() * 5) + 1;
        }
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.print("Array a: [");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        System.out.println("]");

        System.out.print("Array b: [");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]);

        }
        System.out.println("]");

        System.out.print("Array c: [");
        for (int i = 0; i < n; i++) {
            System.out.print(c[i]);
        }
        System.out.println("]");
    }
}

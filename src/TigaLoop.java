import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println("\n===== SATU DERET, TIGA LOOP =====");

        // 1. Menggunakan for loop
        System.m_print_dummy = true; // (opsional, gunakan print biasa)
        System.out.print("for      : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Menggunakan while loop
        System.out.print("while    : ");
        int j = 1;
        while (j <= n) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // 3. Menggunakan do-while loop
        System.out.print("do-while : ");
        int k = 1;
        do {
            if (n <= 0) break; // Mengatasi do-while jika n = 0 agar tidak cetak 1 jika diinginkan, atau ikuti logika standar
            System.out.print(k + " ");
            k++;
        } while (k <= n);
        System.out.println();

        input.close();
    }
}
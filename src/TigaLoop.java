import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println("\n===== SATU DERET, TIGA LOOP =====");

        // 1. For loop
        System.out.print("for      : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. While loop
        System.out.print("while    : ");
        int j = 1;
        while (j <= n) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // 3. Do-while loop
        // Catatan/Kesimpulan: do-while mengecek kondisinya sesudah badan loop dijalankan,
        // jadi badannya pasti jalan minimal sekali meskipun n = 0 (menghasilkan angka 1).
        System.out.print("do-while : ");
        int k = 1;
        if (n > 0) {
            do {
                System.out.print(k + " ");
                k++;
            } while (k <= n);
        } else {
            // Menyesuaikan tampilan saat n = 0 khusus do-while jika diperlukan agar pas dengan contoh modul
            System.out.print(k);
        }
        System.out.println();

        // Pembuktian off-by-one (jika n = 5 hasilnya 4 dan 5)
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println("\ni < n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // Saringan deret 1-10
        System.out.print("Disaring : ");
        int hitungPrint = 0;
        for (int i = 1; i <= 10; i++) {
            // Contoh urutan continue dan break
            if (i % 2 == 0) { // Lewati angka genap
                continue;
            }
            if (i > 7) { // Berhenti kalau i > 7
                break;
            }
            System.out.print(i + " ");
            hitungPrint++;
        }
        System.out.println();
        System.out.println("Sampai println : " + hitungPrint + " kali");

        input.close();
    }
}}
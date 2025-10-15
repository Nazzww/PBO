import java.util.Scanner;

public class PecahanApp {

    // === CLASS PECAHAN ===
    class Pecahan {
        private int pembilang;
        private int penyebut;

        // Konstruktor
        public Pecahan(int pembilang, int penyebut) {
            if (penyebut == 0) {
                throw new IllegalArgumentException("Penyebut tidak boleh nol!");
            }
            this.pembilang = pembilang;
            this.penyebut = penyebut;
            sederhanakan();
        }

        // Operasi penjumlahan
        public Pecahan tambah(Pecahan p) {
            int pembilangBaru = (this.pembilang * p.penyebut) + (p.pembilang * this.penyebut);
            int penyebutBaru = this.penyebut * p.penyebut;
            return new Pecahan(pembilangBaru, penyebutBaru);
        }

        // Operasi pengurangan
        public Pecahan kurang(Pecahan p) {
            int pembilangBaru = (this.pembilang * p.penyebut) - (p.pembilang * this.penyebut);
            int penyebutBaru = this.penyebut * p.penyebut;
            return new Pecahan(pembilangBaru, penyebutBaru);
        }

        // Operasi perkalian
        public Pecahan kali(Pecahan p) {
            int pembilangBaru = this.pembilang * p.pembilang;
            int penyebutBaru = this.penyebut * p.penyebut;
            return new Pecahan(pembilangBaru, penyebutBaru);
        }

        // Operasi pembagian
        public Pecahan bagi(Pecahan p) {
            int pembilangBaru = this.pembilang * p.penyebut;
            int penyebutBaru = this.penyebut * p.pembilang;
            return new Pecahan(pembilangBaru, penyebutBaru);
        }

        // Menyederhanakan pecahan
        private void sederhanakan() {
            int fpb = hitungFPB(Math.abs(pembilang), Math.abs(penyebut));
            pembilang /= fpb;
            penyebut /= fpb;
            if (penyebut < 0) { // Pastikan penyebut positif
                pembilang *= -1;
                penyebut *= -1;
            }
        }

        // Fungsi untuk menghitung FPB
        private int hitungFPB(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public String toString() {
            return pembilang + "/" + penyebut;
        }
    }

    // === METHOD MAIN ===
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PecahanApp app = new PecahanApp(); // buat objek luar agar bisa akses class dalam

        System.out.println("=== PROGRAM OPERASI PECAHAN (OOP) ===");
        System.out.print("Masukkan pembilang pecahan 1: ");
        int a1 = input.nextInt();
        System.out.print("Masukkan penyebut pecahan 1: ");
        int b1 = input.nextInt();

        System.out.print("Masukkan pembilang pecahan 2: ");
        int a2 = input.nextInt();
        System.out.print("Masukkan penyebut pecahan 2: ");
        int b2 = input.nextInt();

        Pecahan p1 = app.new Pecahan(a1, b1);
        Pecahan p2 = app.new Pecahan(a2, b2);

        System.out.println("\nPecahan 1 = " + p1);
        System.out.println("Pecahan 2 = " + p2);

        System.out.println("\nHasil Penjumlahan = " + p1.tambah(p2));
        System.out.println("Hasil Pengurangan = " + p1.kurang(p2));
        System.out.println("Hasil Perkalian   = " + p1.kali(p2));
        System.out.println("Hasil Pembagian   = " + p1.bagi(p2));

        input.close();
    }
}

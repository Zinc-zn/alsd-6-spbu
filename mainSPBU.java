import java.util.Scanner;

public class mainSPBU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianKendaraan antrian = new AntrianKendaraan(10);

        int pilihan;
        do {
            System.out.println("\nMenu 1:");
            System.out.println("--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = scanner.nextLine();
                    System.out.print("Masukkan Tipe: ");
                    String tipe = scanner.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = scanner.nextLine();

                    Kendaraan kendaraanBaru = new Kendaraan(plat, tipe, merk);
                    antrian.tambahKendaraan(kendaraanBaru);
                    break;

                case 2:
                    System.out.println("--- Antrian Kendaraan ---");
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    antrian.tampilJumlahAntrian();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

    }
}
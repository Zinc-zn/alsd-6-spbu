public class Transaksi {
    AntrianKendaraan platNomor;
    String jenisBBM;
    int harga, liter;
    NodeTransaksi head;

    public Transaksi() {}

    public Transaksi(AntrianKendaraan platNomor, String jenisBBM, int harga, int liter) {
        this.platNomor = platNomor;
        this.jenisBBM = jenisBBM;
        this.harga = harga;
        this.liter = liter;
    }

    public void tambahTransaksi(Transaksi t) {
        NodeTransaksi baru = new NodeTransaksi(t, null);
        if (head == null) {
            head = baru;
        } else {
            NodeTransaksi current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = baru;
        }
    }
}

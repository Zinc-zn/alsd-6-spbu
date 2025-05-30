public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter, totalBayar;

    TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
    }

    public double hitungTotalBayar() {
        this.totalBayar = bbm.hargaPerLiter * liter;
        return totalBayar;
    }

    public void tampil() {
        System.out.println(kendaraan.platNomor + ": Rp." + hitungTotalBayar());
    }
}

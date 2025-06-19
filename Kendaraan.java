public class Kendaraan {
    public String platNomor;
    public String tipe;
    public String merk;
    public boolean isVIP; // tambah atribut vip

    public Kendaraan(String platNomor, String tipe, String merk, boolean isVIP) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
        this.isVIP = isVIP;
    }

    public void tampil() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Tipe: " + tipe);
        System.out.println("Merk: " + merk);
        System.out.println("VIP: " + isVIP);
    }
}
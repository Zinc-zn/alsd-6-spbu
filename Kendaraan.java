public class Kendaraan {
    public String platNomor;
    public String tipe;
    public String merk;
    
    public Kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }
    
    public void tampil() {
        System.out.println("Plat Nomor: "+platNomor);
        System.out.println("Tipe: "+tipe);
        System.out.println("Merk: "+merk);
    }

    public void getPlatNomor() {
        System.out.println("Petugas melayani " + platNomor);
    }
}
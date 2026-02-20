public class Dosen5 {
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen5() {
        idDosen = "";
        nama = "";
        statusAktif = false;
        tahunBergabung = 0;
        bidangKeahlian = "";
    }

    public Dosen5(String idDosen, String nama,
                          boolean statusAktif, int tahunBergabung,
                          String bidangKeahlian) {

        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen       : " + idDosen);
        System.out.println("Nama           : " + nama);
        System.out.println("Status Aktif   : " + statusAktif);
        System.out.println("Tahun Gabung   : " + tahunBergabung);
        System.out.println("Keahlian       : " + bidangKeahlian);
        System.out.println("------------------------------");
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
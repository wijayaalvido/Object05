public class DosenMain5 {
    public static void main(String[] args) {

        Dosen5 d1 =
                new Dosen5("D001", "Pak Andi", true, 2015, "AI");

        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2025) + " tahun");
        d1.ubahKeahlian("Machine Learning");
        d1.setStatusAktif(false);
        d1.tampilInformasi();

        Dosen5 d2 = new Dosen5("D002", "Bu Sari", true, 2020, "Basis Data");
        d2.idDosen = "D002";
        d2.nama = "Bu Sari";
        d2.statusAktif = true;
        d2.tahunBergabung = 2020;
        d2.bidangKeahlian = "Basis Data";

        d2.tampilInformasi();
    }
}
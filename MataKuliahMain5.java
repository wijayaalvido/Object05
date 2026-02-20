public class MataKuliahMain5 {
     public static void main(String[] args) {

        MataKuliah5 mk1 = new MataKuliah5();
        mk1.kodeMK = "PASD";
        mk1.nama = "Praktikum Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah5 mk2 =
                new MataKuliah5("BD", "Basis Data", 3, 6);

        mk2.tampilInformasi();
    }
}
class Mahasiswa {

    String nama;
    String nim;
    String kelas;
    double ipk;

    Mahasiswa() {
    }

    Mahasiswa(String nm, String nim, double ipk, String kls) {
        this.nama = nm;
        this.nim = nim;
        this.kelas = kls;
        this.ipk = ipk;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
}
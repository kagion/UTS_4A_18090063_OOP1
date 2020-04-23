
public class Data {

    private String nim;
    private String nama;
    private String kelas;
    private String jurusan;
    private String alamat;

    public Data() {
        nim = "";
        nama = "";
        kelas = "";
        jurusan = "";
        alamat = "";
    }

    public Data(String nim, String nama, String kelas, String jurusan, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNim() { return nim; }

    public String getNama() { return nama; }

    public String getKelas() { return kelas; }

    public String getJurusan() { return jurusan; }

    public String getAlamat() { return alamat; }

}
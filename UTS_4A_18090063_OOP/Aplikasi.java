import java.util.*;

public class Aplikasi {

    public static void main(String args[]) {
        Aplikasi app = new Aplikasi();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            app.printMenu();
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Tambah Data Mahasiswa");
                    app.tambahData();
                    break;
                case 2:
                    System.out.println("Ubah Data Mahasiswa");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Hapus Data Mahasiswa");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Lihat Data Mahasiswa");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void tambahData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("NIM : ");
        String nim = scanner.nextLine();
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Kelas : ");
        String kelas = scanner.nextLine();
        System.out.print("Jurusan : ");
        String jurusan = scanner.nextLine();
        System.out.print("Alamat : ");
        String alamat = scanner.nextLine();
        Operasi.addData(new Data(nim, nama, kelas, jurusan, alamat));
    }

    public void ubahData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukan data yang ingin diubah data ke-");
        int idx = Integer.parseInt(scanner.nextLine());
        System.out.println("===================");
        System.out.println(" :");
        System.out.print("NIM : ");
        String nim = scanner.nextLine();
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Kelas : ");
        String kelas = scanner.nextLine();
        System.out.print("Jurusan : ");
        String jurusan = scanner.nextLine();
        System.out.print("Alamat : ");
        String alamat = scanner.nextLine();
        // untuk meyimpan perubahan
        Operasi.editData(new Data(nim, nama, kelas, jurusan, alamat), idx - 1);
    }

    public void hapusData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Hapus data ke-");
        int idx = scanner.nextInt();
        // hapus data
        Operasi.removeData(idx - 1);
    }

    public void listData() {
        // menampilkan data
        List<Data> result = Operasi.getListData();
        for (int i = 0; i < result.size(); i++) {
            System.out.println();
            System.out.println("data ke-" + (i + 1));
            System.out.println("  NIM : " + result.get(i).getNim());
            System.out.println("  Nama : " + result.get(i).getNama());
            System.out.println("  Kelas : " + result.get(i).getKelas());
            System.out.println("  Jurusan : " + result.get(i).getJurusan());
            System.out.println("  Alamat : " + result.get(i).getAlamat());
        }
    }

    public void printMenu() {
        System.out.println();
        System.out.println("===================================");
        System.out.println("APLIKASI DATA MAHASISWA");
        System.out.println("===================================");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Ubah Data Mahasiswa");
        System.out.println("3. Hapus Data Mahasiswa");
        System.out.println("4. Lihat Data Mahasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }

}
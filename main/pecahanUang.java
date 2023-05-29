package main.pecahan.main;

import java.util.Scanner;

public class pecahanUang {
    private int jumlahUang;
    private pecahan[] pecahan = {
        new pecahan100000(),
        new pecahan50000(),
        new pecahan20000(),
        new pecahan10000(),
        new pecahan5000(),
        new pecahan2000(),
        //new pecahan1000()
    };
    public pecahanUang(int jumlahUang) {
        this.jumlahUang = jumlahUang;
    }

    public int getJumlahUang() {
        return jumlahUang;
    }

    public void setJumlahUang(int jumlahUang) {
        this.jumlahUang = jumlahUang;
    }
    public void tampilkanPecahan() {
        int sisa = jumlahUang;

        for (pecahan p : pecahan) {
            int jumlah = sisa / p.getNilai();
            if (jumlah > 0) {
                System.out.println(p.getNama() + " = " + jumlah);
                sisa -= jumlah * p.getNilai();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jumlah Uang = ");
        pecahanUang pu = new pecahanUang(input.nextInt());
        pu.tampilkanPecahan();
    }
}

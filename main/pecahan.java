package main.pecahan.main;

abstract class pecahan {

    protected int  nilai;

    public pecahan(int nilai) {
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    public abstract String getNama();

}

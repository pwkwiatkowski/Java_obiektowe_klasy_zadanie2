package com.company;

public class Main {

    public static void main(String[] args) {
	    KontoBankowe konto1 = new KontoBankowe();
	    konto1.pokazSaldo();
	    konto1.kredyt(100);
	    konto1.pokazSaldo();
	    konto1.debet(50);
	    konto1.pokazSaldo();
    }
}

class KontoBankowe {
    private int saldo=0;

    public void pokazSaldo() {
        System.out.println("Saldo wynosi: "+saldo);
    }
    public void kredyt(int ilosc) {
        saldo+=ilosc;
    }
    public void debet(int ilosc) {
        saldo-=ilosc;
    }
}
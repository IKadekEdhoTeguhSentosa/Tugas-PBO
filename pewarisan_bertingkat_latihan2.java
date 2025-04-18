/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pewarisan_bertingkat_latihan2;

/**
 *
 * @author dexed
 */
// Kelas induk (superclass)
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

// Kelas anak (subclass) yang mewarisi dari Hewan
class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow arghhh!");
    }
}

// Kelas anak (subclass) yang mewarisi dari Kucing
class KucingAnggora extends Kucing {
    void jenis() {
        System.out.println("Ini adalah kucing buangan.");
    }
}

// Main class untuk menjalankan program
public class pewarisan_bertingkat_latihan2 {
    public static void main(String[] args) {
        KucingAnggora anggora = new KucingAnggora();

        anggora.makan(); // Memanggil metode dari superclass Hewan
        anggora.suara(); // Memanggil metode dari subclass Kucing
        anggora.jenis(); // Memanggil metode dari subclass KucingAnggora
    }
}
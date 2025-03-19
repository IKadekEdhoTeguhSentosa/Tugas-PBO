/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pewarisan_latihan1;

/**
 *
 * @author dexed
 */
// Kelas induk (superclass)
class Hewan {
    String nama;

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// Kelas anak (subclass) yang mewarisi dari Hewan
class Kucing extends Hewan {
    void suara() {
        System.out.println(nama + " mengeong: Meow arghhhhh!");
    }
}

// Main class untuk menjalankan program
public class pewarisan_latihan1 {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        kucing1.nama = "law";
        
        kucing1.makan(); // Memanggil metode dari superclass
        kucing1.suara(); // Memanggil metode dari subclass
    }
}
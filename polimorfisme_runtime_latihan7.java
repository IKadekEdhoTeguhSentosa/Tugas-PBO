/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme_runtime_latihan7;

/**
 *
 * @author dexed
 */
class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

// Subclass Kucing
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Kucing bersuara: Meow! Meow! arghh");
    }
}

// Subclass Anjing
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Anjing bersuara: Guk! Guk! auuuu");
    }
}

// Main class
public class polimorfisme_runtime_latihan7 {
    public static void main(String[] args) {
        // Polimorfisme: Referensi bertipe Hewan, tetapi objeknya adalah Kucing dan Anjing
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();

        // Memanggil metode bersuara() dari objek sebenarnya (Kucing dan Anjing)
        hewan1.bersuara(); // Output: Kucing bersuara: Meow! Meow!
        hewan2.bersuara(); // Output: Anjing bersuara: Guk! Guk!
    }
}
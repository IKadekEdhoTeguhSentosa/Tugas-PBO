/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author dexed
 */
import java.util.Scanner;

public class logindanregis {
    public static void main(String[] args) {
        // Data login yang valid
        final String USERNAME = "dexedho";
        final String PASSWORD = "123456788";

        Scanner input = new Scanner(System.in);
        int attempts = 0;
        boolean success = false;

        while (attempts < 3) {
            System.out.print("Masukkan Username: ");
            String userInput = input.nextLine();

            System.out.print("Masukkan Password: ");
            String passInput = input.nextLine();

            if (userInput.equals(USERNAME) && passInput.equals(PASSWORD)) {
                System.out.println("Selamat datang, " + USERNAME + "!");
                success = true;
                break; // Keluar dari loop jika login berhasil
            } else {
                attempts++;
                System.out.println("Username atau Password salah. Percobaan ke-" + attempts);
            }
        }

        if (!success) {
            System.out.println("Akun diblokir!");
        }

        input.close();
    }
}
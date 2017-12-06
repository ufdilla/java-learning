/**
 * runEmployee
 */
import java.io.*;

public class runEmployee {

    public static void main(String[] args) {
        /* Create two objects using constructor */
        employee satu = new employee("Umi Fadilatun");
        employee dua = new employee("Andi Felani");

        // Meminta metode untuk setiap objek yang dibuat
        satu.usiaEmpl(25);
        satu.jabEmpl("Junior Developer");
        satu.gajiEmpl(3700);
        satu.showEmpl();

        dua.usiaEmpl(25);
        dua.jabEmpl("HelpDesk");
        dua.gajiEmpl(4000);
        dua.showEmpl();
    }
}
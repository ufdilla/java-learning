/**
 * employee
 * import statement
 */

import java.io.*;

public class employee {

    String nama, jabatan;
    int usia;
    double gaji;

    // This is the constructor of the class Employee
    public employee(String nama){
        this.nama = nama;
    }

    // Assign the age of the Employee  to the variable age.
    public void usiaEmpl(int usiaEmpl) {
        usia = usiaEmpl;
    }

    /* Assign the jabatan to the variable jabatan.*/
    public void jabEmpl(String jabEmpl) {
        jabatan = jabEmpl;
    }

    public void gajiEmpl(double gajiEmpl) {
        gaji = gajiEmpl;
    }

    /* Print the Employee details */
    public void showEmpl() {
        System.out.println("Name:" + nama);
        System.out.println("Age:" + usia);
        System.out.println("Designation:" + jabatan);
        System.out.println("Salary:" + gaji);
    }
}
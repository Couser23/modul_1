import java.util.Scanner;

class LibrarySystem {
    public Scanner scanner = new Scanner(System.in);

    void start() {
        int choice;
        String nim, username, password;
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM kamu: ");
                    nim = scanner.next();
                    isLoggedIn = loginStudent(nim);
                    break;
                case 2:
                    System.out.print("Masukkan username: ");
                    username = scanner.next();
                    System.out.print("Masukkan password: ");
                    password = scanner.next();
                    isLoggedIn = loginAdmin(username, password);
                    break;
                case 3:
                    System.out.println("Turu");
                    System.exit(0);
                default:
                    System.out.println("Input salah, silahkan pilih diantara 1-3.");
            }
        }

        // Close the scanner after use
        scanner.close();
    }

    void printMenu() {
        System.out.println("----- Library System -----");
        System.out.println("1. Login sebagai Mahasiswa");
        System.out.println("2. Login sebagai Admin");
        System.out.println("3. Keluar");
        System.out.print("Pilih (1-3): ");
    }

    boolean loginStudent(String nim) {
        if (nim.length() != 15) {
            System.out.println("NIM tidak valid, Maximal panjang 15");
            return false;
        } else {
            System.out.println("Berhasil login Mahasiswa");
            return true;
        }
    }

    boolean loginAdmin(String username, String password) {
        if ("couserr".equals(username) && "Couserr".equals(password)) {
            System.out.println("Berhasil login sebagai admin");
            return true;
        } else {
            System.out.println("Admin tidak ditemukan");
            return false;
        }
    }
}

public class kerja {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.start();
    }
}


// digunakan jika ingin memakai nim single
//if ("202310370311362".equals(nim)) {
//            System.out.println("Successful Login as Student");
//            return true;
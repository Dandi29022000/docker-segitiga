import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Segitiga {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        double sisi, tinggi, tinggiPrisma, luas, luasPermukaan, keliling, volume;

        System.out.print("Masukkan Nama\t\t:");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM\t\t:");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas\t\t:");
        kelas = sc.nextLine();

        System.out.print("Masukkan sisi segitiga\t\t:");
        sisi= sc.nextInt();
        System.out.print("Masukkan tinggi segitiga\t\t:");
        tinggi= sc.nextInt();
        System.out.print("Masukkan tinggi prisma segitiga\t\t:");
        tinggiPrisma= sc.nextInt();

        luas = 1/2 * sisi * tinggi;
        keliling = sisi + sisi + sisi;
        volume = ((sisi * tinggi) / 2) * tinggiPrisma;
        luasPermukaan = (2 * luas) + (keliling * tinggiPrisma);

        System.out.println("");
        System.out.println("=================================================");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("NIM\t\t\t: " + nim);
        System.out.println("Kelas\t\t\t: " + kelas);
        System.out.println("=================================================");
        System.out.println(String.format("Keliling segitiga adalah %.2f", keliling));
        System.out.println(String.format("Luas segitiga adalah %.2f", luas));
        System.out.println(String.format("Luas permukaan segitiga adalah %.2f", luasPermukaan));
        System.out.println(String.format("Volume segitiga adalah %.2f", volume));
        System.out.println("=================================================");
    }
}
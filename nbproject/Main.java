package BABIV;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        String nama, alamat, email, telepon, email2;
        Dataa a[] = new Dataa[0];
        int pilihan = 0, jumlah = 0, count=0,count2=1;    
        System.out.println("==================================================");
        System.out.println("                   BUKU ALAMAT                    "); 
        System.out.println("==================================================");
        System.out.println("1. Tambah Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Tutup");
        
        do {
            System.out.print("Pilih  : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    Dataa[] temp = new Dataa [a.length];
                    temp = a;
                    a = new Dataa[temp.length+1];
                    for (int i=0;i<temp.length;i++){
                        a[i]=temp[i];
                    }
                    //Penambahan Array secara berlanjut
                        System.out.print("Masukkan Nama     : ");
                        nama = in2.nextLine();
                        System.out.print("Masukkan Alamat   : ");
                        alamat = in2.nextLine();
                        System.out.print("Masukkan No. Telp : ");
                        telepon = in2.nextLine();
                        System.out.print("Masukkan E-mail   : ");
                        email = in2.nextLine();
                        a[count] = new Dataa(nama,alamat,email,telepon);
                        do{
                        System.out.print("Masukkan Kembali Email : ");
                        email = in2.nextLine();
                        a[count].validasi(email);
                        }
                        while(a[count].validasi(email)==false);
                        count++;
                        System.out.println("");
                    break;
                    
                case 2:
                    System.out.printf("%-15s %-15s %-15s %-15s \n","Nama","Alamat","Telepon","Email");
                    for (int i=0;i<a.length;i++){
                        System.out.print(count2++ + ". ");
                        a[i].Display();
                    }
                    System.out.println("");
                    break;
                    
                case 3:
                    break;
            }
        } 
        while (pilihan != 3);
    }
}
    
                <root id="src.dir"/>
            </source-roots>
            <test-roots>
                <root id="test.src.dir"/>
            </test-roots>
        </data>
    </configuration>
</project>

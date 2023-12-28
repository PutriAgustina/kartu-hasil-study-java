import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=========================================");
       
        System.out.print("Masukkan Nama Mahasiswa\t: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jumlah SKS\t: ");
        int sks = input.nextInt();
        System.out.print("Masukkan Jumlah Matkul\t: ");
        int jumlah = input.nextInt();
        
        System.out.println("=========================================");
        
        String mahasiswa = "";
        String[] matkul = new String[jumlah];
        String[] nilai = new String[jumlah];
        
        System.out.println("\t KARTU HASIL STUDY");
        
        int total = 0;
        int rata = 0;
        
        
        for (int i = 0; i < jumlah; i++) {
        System.out.print("Masukkan Mata Kuliah " + (i+1) + "  : ");
        matkul[i] = input.next();
        System.out.print("Masukkan Nilai\t\t: ");
        nilai[i] = input.next();
            
            total += Integer.parseInt(nilai[i]);
            rata = total / jumlah;
            
        }
        System.out.println("=========================================");
        System.out.println("Nama Mahasiswa\t\t: " + nama.toUpperCase());
        System.out.println("Jumlah SKS\t\t: " + sks);
        System.out.println("Jumlah Mata Kuliah\t: " + jumlah);
        System.out.println("=========================================");
        System.out.println("=====----  KARTU RENCANA STUDY ----======");
        System.out.println("=========================================");
        System.out.printf("| %-2s | %-15s | %-8s |\n", "NO", "MATA KULIAH", "NILAI");
        System.out.println("=========================================");
        System.out.println(mahasiswa);
        
        
        for(int i = 0; i < jumlah; i++){
            System.out.printf("| %-2s | %-15s | %-8s |\n", (i+1), matkul[i].toUpperCase(), nilai[i]);
    }
    
        System.out.println("------------------------------------------");
        System.out.println("|        TOTAL         |\t" + total + "  |");
        System.out.println("|      RATA-RATA       |\t" + rata + "   |");
  }
    
}

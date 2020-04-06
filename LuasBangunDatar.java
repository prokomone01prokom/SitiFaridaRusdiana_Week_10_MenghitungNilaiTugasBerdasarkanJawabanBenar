
import java.util.Scanner;
public class LuasBangunDatar {
    
    public static void main (String[] args) {
        
        System.out.println(" JAWABLAH PERTANYAAN DIBAWAH INI DENGAN BENAR");
        System.out.println("     MATERI LUAS DAN KELILING BANGUN DATAR");
        
        String hasil, jawaban = "Congratulation, jawaban kamu benar", jwbnslh = "Sorry, belajar kamu kurang serius";
        int Benar = 1, Salah = 1, totbenar, totsalah, bner1 = 0, bner2 = 0, bner3 = 0, bner4 = 0, bner5 = 0;
        int Slah1 = 0, Slah2 = 0, Slah3 =0, Slah4 = 0, Slah5 = 0;
        
        String[] f = new String[5];
        
        f[0] = "Jika sisi suatu persegi adalah 6 cm maka luas persegi adalah... .";
        f[1] = "6*6=36 .";
        f[2] = "6+6=16 .";
        f[3] = "6:6=1 .";
        f[4] = "6-6=0 .";
        System.out.println("1. " + f[0]);
        System.out.println("a. " + f[1]);
        System.out.println("b. " + f[2]);
        System.out.println("c. " + f[3]);
        System.out.println("d. " + f[4]);
        Scanner a1 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine( );
        switch (hasil) {
            case "a":
                System.out.println(jawaban);
                bner1 = Benar ;
                totbenar = bner1;
                 System.out.println("Jawaban benar: " + totbenar);
                 totsalah = Slah1;
                System.out.println("Jawaban Salah :" + totsalah);
                break;
            case "b":
                System.out.println(jwbnslh);
                Slah1 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bner1;
                 System.out.println("Jawaban benar: " + totbenar);
                 totsalah = Slah1;
                System.out.println("Jawaban Salah : " + totsalah + "   Catatan : Pelajari rumus luas persegi");
                break;
            case "c":
                 System.out.println(jwbnslh);
                Slah1 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bner1;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1;
                System.out.println("Jawaban Salah : " + totsalah + "   Catatan : Pelajari rumus luas persegi");
                break;
            case "d":
                 System.out.println(jwbnslh);
                Slah1 = Salah;
                System.out.println("kunci jawaban = a");
                totbenar = bner1;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1;
                System.out.println("Jawaban Salah : " + totsalah + "   Catatan : Pelajari rumus luas persegi");
                break;
                
                
        }
        System.out.println("");
        f[0] = "Jika sisi suatu persegi panjang adalah 6 cm dan 9 cm maka luas persegi panjang adalah... .";
        f[1] = "6+9= 15 .";
        f[2] = "6*9= 54 .";
        f[3] = "6:9= 2/3 .";
        f[4] = "6-9= -3 .";
        System.out.println("2. " + f[0]);
        System.out.println("a. " + f[1]);
        System.out.println("b. " + f[2]);
        System.out.println("c. " + f[3]);
        System.out.println("d. " + f[4]);
        Scanner a2 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine( );
        switch (hasil) {
            case "b":
                System.out.println(jawaban);
                bner2 = Benar ;
                totbenar = bner1 + bner2;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2;
                System.out.println("Jawaban Salah: " + totsalah );
                break;
            case "a":
                System.out.println(jwbnslh);
                Slah2 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bner1 + bner2;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus luas persegi");
                break;
            case "c":
                 System.out.println(jwbnslh);
                Slah2 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bner1 + bner2;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus luas persegi");
                break;
            case "d":
                 System.out.println(jwbnslh);
                Slah2 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bner1 + bner2;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus luas persegi");
                break;
        }
        System.out.println("");
        f[0] = "Sebuah taman berbentuk persegi panjang berukuran panjang 32 m dan lebar 24 m. Disekelilingi taman akan di pasang lampu dengan jarak antar lampu 4 m. jumlah lampu yang diperlukan sebanyak... .";
        f[1] = "28 Lampu .";
        f[2] = "24 Lampu .";
        f[3] = "52 Lampu .";
        f[4] = "112 Lampu .";
        System.out.println("3. " + f[0]);
        System.out.println("a. " + f[1]);
        System.out.println("b. " + f[2]);
        System.out.println("c. " + f[3]);
        System.out.println("d. " + f[4]);
        Scanner a3 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine( );
        switch (hasil) {
            case "b":
                System.out.println(jawaban);
                bner3 = Benar ;
                totbenar = bner1 + bner2 + bner3;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3;
                System.out.println("Jawaban Salah: " + totsalah );
                break;
            case "a":
                System.out.println(jwbnslh);
                Slah3 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bner1 + bner2 + bner3;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus keliling persegi panjang");
                break;
            case "c":
                 System.out.println(jwbnslh);
                Slah3 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bner1 + bner2 + bner3;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus keliling persegi panjang");
                break;
            case "d":
                 System.out.println(jwbnslh);
                Slah3 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bner1 + bner2 + bner3;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus keliling persegi panjang");
                break;
        }
        System.out.println("");
        f[0] = "Jika panjang alas suatu segitiga adalah 12 cm dan tingginya 5 cm luas segitiga itu adalah... .";
        f[1] = "2 * (12+5) = 34 .";
        f[2] = "2 * (12:5) = 4,8 .";
        f[3] = "2 * (12*5) = 30 .";
        f[4] = "2 * (12-5) = 14 .";
        System.out.println("4. " + f[0]);
        System.out.println("a. " + f[1]);
        System.out.println("b. " + f[2]);
        System.out.println("c. " + f[3]);
        System.out.println("d. " + f[4]);
        Scanner a4 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine( );
        switch (hasil) {
            case "c":
                System.out.println(jawaban);
                bner4 = Benar ;
                totbenar = bner1 + bner2 + bner3 + bner4;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3 + Slah4;
                System.out.println("Jawaban Salah: " + totsalah );
                break;
            case "a":
                System.out.println(jwbnslh);
                Slah4 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bner1 + bner2 + bner3 + bner4;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3 + Slah4;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus luas segitiga");
                break;
            case "b":
                 System.out.println(jwbnslh);
                Slah4 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bner1 + bner2 + bner3 + bner4;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3 + Slah4;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus luas segitiga");
                break;
            case "d":
                 System.out.println(jwbnslh);
                Slah4 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bner1 + bner2 + bner3 + bner4;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3 + Slah4;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus luas segitiga");
                break;
        }
        System.out.println("");
        f[0] = "Keliling persegi ABCD adalah 48 cm, berapakah panjang sisinya... .";
        f[1] = "15 .";
        f[2] = "24 .";
        f[3] = "12 .";
        f[4] = "14 .";
        System.out.println("5. " + f[0]);
        System.out.println("a. " + f[1]);
        System.out.println("b. " + f[2]);
        System.out.println("c. " + f[3]);
        System.out.println("d. " + f[4]);
        Scanner a5 = new Scanner(System.in);
        System.out.print("Jawab : ");
        hasil = a1.nextLine( );
        switch (hasil) {
            case "d":
                System.out.println(jawaban);
                bner5 = Benar ;
                totbenar = bner1 + bner2 + bner3 + bner4 + bner5;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3 + Slah4 + Slah5;
                System.out.println("Jawaban Salah: " + totsalah );
                break;
            case "a":
                System.out.println(jwbnslh);
                Slah5 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bner1 + bner2 + bner3 + bner4 + bner4;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3 + Slah4 + Slah5;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus Keliling persegi");
                break;
            case "c":
                 System.out.println(jwbnslh);
                Slah5 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar = bner1 + bner2 + bner3 + bner4 + bner5;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3 + Slah4 + Slah5;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus Keliling persegi");
                break;
            case "b":
                 System.out.println(jwbnslh);
                Slah5 = Salah;
                System.out.println("kunci jawaban = b");
                totbenar =bner1+bner2+bner3+bner4+bner5;
                 System.out.println("Jawaban benar: " + totbenar );
                 totsalah = Slah1 + Slah2 + Slah3 + Slah4 + Slah5;
                System.out.println("Jawaban salah: " + totsalah + "   Catatan : Pelajari rumus Keliling persegi");
                break;
    }
        System.out.println("\n");
        System.out.println("Hasil Akhir");
        totbenar = bner1+bner2+bner3+bner4+bner5;
        System.out.println("Jawaban yang benar adalah : " + totbenar );
        totsalah = Slah1+Slah2+Slah3+Slah4+Slah5;
        System.out.println("Jawaban yang salah adalah : " + totsalah );
        System.out.println("Total nilai adalah : " + (totbenar *20));
        String nG;
        
         if (totbenar *2 >= 100){
           nG = "A";
      } else if (totbenar *2 >= 60){
           nG = "B";
      } else if (totbenar *2 >= 40){
           nG = "C Catatan : Silakan dipelajari lagi agar nilai bisa maksimal";
      } else if (totbenar *2 >= 0){
           nG = " Silahkan belajar yang rajin ya nak pelajari materi luas dan keliling bangun datar";
      } else {
          nG = "input salah";
      }
      if ("input salah".equals(nG)){
          System.out.println(nG);
      }else {
         System.out.println("Nilai kamu :" + nG);
      }

}}
package sesi3;

/**
 *
 * @author Dzikry
 */
public class CalonProgrammer {
   public static void main(String[] args) {
       int scorekoding = 62;
       String Nilaikoding = "";
       String NilaiInterview = "";
       
       if ( scorekoding > 80 ){
           Nilaikoding = "LOLOS";
           NilaiInterview = "A";
       }
           else if ( scorekoding > 60 & scorekoding < 80 ){
           Nilaikoding = "DIPERTIMBANGKAN";
           NilaiInterview = "B";
       }
           else if ( scorekoding < 60 ){
           Nilaikoding = "GAGAL";
       }
       
       if (
       (Nilaikoding == "LOLOS" || Nilaikoding == "DIPERTIMBANGKAN") &&
       (NilaiInterview == "A" || NilaiInterview == "B")
    ) {
      System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
    } else {
      System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
    }

  }
       
       
   }


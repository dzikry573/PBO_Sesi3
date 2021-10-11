package sesi3;

/**
 *
 * @author Dzikry
 */
public class Conan {
    public static class People {
    public String nama;
    public int umur;
    public String tempatTinggal;
    public int tabungan;

    People (String nama, int umur, String tempatTinggal, int tabungan) {
      this.nama = nama;
      this.umur = umur;
      this.tempatTinggal = tempatTinggal;
      this.tabungan = tabungan;
    }
  }
    public static void main(String[] args) {
    People PangkatDon = new People("Elkhaf Khadafi", 42, "Nevada", 12000000);
    People Pangkatboss = new People("Eric Benjamin", 35, "Nevada", 1500000 );
    People PangkatCapo = new People("Meliodas", 24, "California", 900000);
    People tidak_mencurigakan = new People("Ucup", 20, "Rambay", 700);

    System.out.println(getWarning(PangkatDon));
    System.out.println(getWarning(Pangkatboss));
    System.out.println(getWarning(PangkatCapo));
    System.out.println(getWarning(tidak_mencurigakan));
  }

  public static String getWarning(People People) {
    String syndicate = getSyndicate(
      People.umur,
      People.tempatTinggal,
      People.tabungan
    );


    switch(syndicate.toLowerCase()) {
      case "don":
      case "underboss":
      case "capo":
        return People.nama + " kemungkinan adalah seorang anggota mafia dengan pangkat " + syndicate;
      default:
        return People.nama + " tidak mencurigakan.";
    }
  }

  public static String getSyndicate(
      int umur, 
      String tempatTinggal, 
      int tabungan
  ) {
    if ( umur > 40 & tabungan > 10000000) {
      switch(tempatTinggal.toLowerCase()) {
        case "nevada":
        case "havana":
        case "new york":
          return "Don";
        default:
          return "";
      }
    }
    
    else if (
      ( !(umur >= 25 & umur <= 40) ) || 
      ( tabungan <= 1000000 && tabungan > 2000000 )
    ) if (
            ( umur >= 18 & umur <= 24 ) &&
            ( tabungan < 1000000 )
            ) {
        switch(tempatTinggal.toLowerCase()) {
            case "california":
            case "detroit":
            case "boston":
                return "Capo";
            default:
                return "";
        }
    }

    else {
        return "";
    }
    
    else {
        switch(tempatTinggal.toLowerCase()) {
            case "new jersey":
            case "manhattan":
            case "nevada":
                return "Underboss";
            default:
                return "";
      }
    }
  }


}
    
    


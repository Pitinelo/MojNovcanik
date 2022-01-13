import java.util.Scanner;

public class TestRegistracija {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Registracija r = new Registracija();
        
        Login l = new Login();

        User u = new User();

        boolean lIR = true;
        while (lIR){
            System.out.println(GlavniMeni.ispisLoginaIRegistracije());
            int opcija = sc.nextInt();

            switch (opcija){
                case 1:
                    r.kreirajUsera();
                    break;
                case 2:
                    u = l.ulogovaniKorisnik(r.getRegistrovaniKorisnici());
                    lIR = false;
                    break;
                case 0:
                    System.out.println("Uspesno ste izasli iz programa.");
                    System.exit(0);
            }
        }



        Racun rc2 = new Racun(u);
        boolean vrti = true;
        while (vrti){
            System.out.println(GlavniMeni.ispisGlavnogMenija());

            int opcija = sc.nextInt();

            switch (opcija) {
                case 1:
                    Racun rc1 = new Racun(u);
                    break;
                case 4:
                    rc2.uplatiNovac();
                    break;
                case 5:
                    rc2.isplataNovca();
                    break;
                case 6:
                    System.out.println("Uspesno ste izasli iz apliakcije");
                    vrti = false;
                    break;
            }

        }







    }
}

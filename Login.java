import java.util.ArrayList;
import java.util.Scanner;

public class Login extends Registracija {


    Scanner sc = new Scanner(System.in);

    public User ulogovaniKorisnik(ArrayList<User> logovani) {
        int brojac = 0;
        User ulogovani = new User();





      /*  for (User u : logovani) {

            while (brojac <3){

                System.out.println("Unesite vas username: ");
                String loginUser = sc.next();

                if (loginUser.equals(u.getUsername())) {
                    ulogovani.setUsername(loginUser);
                    System.out.println("Unesite vas password.");
                    String loginPass = sc.next();


                    if (loginPass.equals(u.getPassword())) {
                        ulogovani.setPassword(loginPass);
                        System.out.println("Uspesno ste ulogovani.");
                        brojac = 3;
                    } else {
                        System.out.println("Uneli ste pogresan username ili password.");
                        brojac++;
                    }


                } else {
                    System.out.println("Unesite vas password: ");
                    String loginPass = sc.next();
                    brojac++;
                    System.out.println("Uneli ste pogresan username ili password.");

                }

            }

        } */

        while (brojac < 3) {

            System.out.println("Unesite vas username: ");
            String loginUser = sc.next();
            System.out.println("Unesite vas password.");
            String loginPass = sc.next();

            for (User u : logovani) {
                if (loginUser.equals(u.getUsername())) {
                    ulogovani.setUsername(loginUser);
                    if (loginPass.equals(u.getPassword())) {
                        ulogovani.setPassword(loginPass);
                        System.out.println("Uspesno ste se ulogovali");
                        System.out.println();
                        brojac = 5;
                    }

                }

            }
            if (brojac != 5 && brojac !=2 ) {
                System.out.println("Pogresili ste Username ili password.");
            } else if (brojac == 2) {
                System.out.println("Pogresili ste Username ili password 3 puta. Mozete da pokusate ponovo za 30s.");
            }
            brojac++;


        }

        return ulogovani;
    }


}

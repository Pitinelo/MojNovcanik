import java.util.ArrayList;
import java.util.Scanner;

public class Registracija extends User {

    private ArrayList <User> registrovaniKorisnici;

    public Registracija() {
        this.registrovaniKorisnici = new ArrayList<>();
    }

    Scanner sc = new Scanner(System.in);

    public ArrayList<User> getRegistrovaniKorisnici() {
        return registrovaniKorisnici;
    }

    public void setRegistrovaniKorisnici(ArrayList<User> registrovaniKorisnici) {
        this.registrovaniKorisnici = registrovaniKorisnici;
    }

    public void kreirajUsera (){

        User u = new User();
        System.out.println("Unesi username novog korisnika: ");
        String user = sc.next();
        u.setUsername(user);
        System.out.println("Unesi pass novog korisnika: ");
        String pass = sc.next();
        u.setPassword(pass);

        registrovaniKorisnici.add(u);





    }
}

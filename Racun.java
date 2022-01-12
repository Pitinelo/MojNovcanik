import java.util.Random;
import java.util.Scanner;

public class Racun {

    private static int brojNovogRacuna = 00000001;
    protected User korisnik;
    protected int brojRacuna;
    protected double stanjeNaRacunu;

    Scanner sc = new Scanner(System.in);

    public Racun(User korisnik) {

        this.korisnik = korisnik;
        this.brojRacuna = brojNovogRacuna;
        System.out.println("Upisite pocetno stanje na racunu: ");
        this.stanjeNaRacunu = sc.nextDouble();
        brojNovogRacuna ++;
    }

    public User getKorisnik() {
        return korisnik;
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void uplatiNovac (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko novca zelite da uplatite na racun?");
        double suma = sc.nextDouble();
        this.stanjeNaRacunu = this.stanjeNaRacunu + suma;
    }

    public void isplataNovca () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko novca zelite da isplatite sa racuna?");
        double suma = sc.nextDouble();
        if (suma <= this.stanjeNaRacunu){
            this.stanjeNaRacunu = this.stanjeNaRacunu - suma;
        }else {
            System.out.println("Nemate dovoljno sredstava na racunu.");
            System.out.println();;
        }

    }
}

public class GlavniMeni {

    public static String ispisGlavnogMenija(){
        StringBuilder sb = new StringBuilder();

        sb.append("Dobrodosli u glavni meni.").append("\n");
        sb.append("1.Otvaranje racuna").append("\n");
        sb.append("2.Gasenje racuna").append("\n");
        sb.append("3.Ispis racuna u banci").append("\n");
        sb.append("4.Uplata novca na racun").append("\n");
        sb.append("5.Isplata novca sa racuna").append("\n");
        sb.append("6.Izlaz iz aplikacije.").append("\n").append("\n");
        sb.append("Izaberite vasu opciju").append("\n");

        return sb.toString();
    }
}

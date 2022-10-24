package ba.unsa.etf.rpr;

public class Racun {
    private long brojRacuna;
    private Double stanjeRacuna;
    private boolean odobrenjePrekoracenja;
    private Osoba korisnikRacuna;
    public Racun(Long brojRacuna, Osoba vlasnik){
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = vlasnik;
        stanjeRacuna = 0D;
    }
    private boolean provjeriOdobrenjePrekoracenja(Double x){ return odobrenjePrekoracenja;}
    public boolean izvrsiUplatu(Double uplata){
        if (uplata.compareTo(Double.valueOf(0)) <= 0)return false;
        stanjeRacuna += uplata;
        return true;
    }
    public boolean izvrsiIsplatu(Double isplata){
        if (stanjeRacuna.compareTo(Double.valueOf(0)) <= 0 && !odobrenjePrekoracenja)return false;
        stanjeRacuna -= isplata;
        return true;
    }
    public void odobriPrekoracenje(Double x){
        odobrenjePrekoracenja = true;
    }
    public void IspisiStanjeRacuna(){//Nije zadano zadatakom, dodao sebi da testiram
        System.out.println(stanjeRacuna);
    }
}

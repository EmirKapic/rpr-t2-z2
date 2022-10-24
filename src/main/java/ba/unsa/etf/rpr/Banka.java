package ba.unsa.etf.rpr;

import java.util.List;

public class Banka {
    private Long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;
    public Banka(){}
    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik k = new Korisnik(ime,prezime);
        korisnici.add(k);
        return k;
    }
    public Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        Uposlenik u = new Uposlenik(ime,prezime);
        uposlenici.add(u);
        return u;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik k){
        Racun r = new Racun(brojRacuna, k);
        return r;
    }
}

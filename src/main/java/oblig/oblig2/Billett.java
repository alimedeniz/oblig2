package oblig.oblig2;

import java.util.Set;

class Billett {
    private String film;
    private int antall;
    private String fornavn;
    private String etternavn;
    private String tlf;
    private String epost;

    public Billett(String film, int antall, String fornavn, String etternavn, String tlf, String epost){
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.tlf = tlf;
        this.epost = epost;
    }

    public Billett(){
    }

   public int getAntall() {
       return antall;
   }

   public String getEpost() {
       return epost;
   }

   public String getEtternavn() {
       return etternavn;
   }

   public String getFilm() {
       return film;
   }

   public String getFornavn() {
       return fornavn;
   }

   public String getTlf() {
       return tlf;
   }

   public void setAntall(int antall) {
       this.antall = antall;
   }

   public void setEpost(String epost) {
       this.epost = epost;
   }

   public void setEtternavn(String etternavn) {
       this.etternavn = etternavn;
   }

   public void setFilm(String film) {
       this.film = film;
   }

   public void setFornavn(String fornavn) {
       this.fornavn = fornavn;
   }

   public void setTlf(String tlf) {
       this.tlf = tlf;
   }

   

}

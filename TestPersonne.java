package Eercice3_personne;
public class TestPersonne {
    public static void main(String[] args) {
        Personne personne =new Personne();
        personne.setFirstName("mareym");
        personne.setName("manefki");
        personne.setDaeNaiss(7,5,2003);
        int age=personne.ageEn2023();
        System.out.println(personne.firstName+" "+personne.name+" votre age est:"+age);
    }
}

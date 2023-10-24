package Exercice2_Point;

public class TestPoint {
    public static void main(String[] args) {
        Point p=new Point();
        Point q=new Point(3,2);
        System.out.println("coordonnes  de  point "+p.numero +" sont:");
        p.affichePoint();
        System.out.println("coordonnes de point "+q.numero+" sont:");
        q.affichePoint();
        p.setcoordonnerPoint(1,9);
        System.out.println("les nouveaux coordonnes  de  point "+p.numero+" sont:");
        p.affichePoint();
        p.translate(8,3);
        System.out.println("les nouveaux coordonnes  de  point "+p.numero+1+"sont:");
        p.affichePoint();
        if(p.origine()){
            System.out.println("le point "+p.numero+"est dans l'origine");
        }
        else System.out.println("le point "+p.numero+"n' est pas dans l'origine");
        if (p.egale(p,q)){
            System.out.println(" coordonnes de point p et q sont égaux");
        }else System.out.println(" coordonnes de point p et q n'sont pas égaux");
        System.out.println("le nombre de point est "+Point.nombre);
    }
}

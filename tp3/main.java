import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random ra = new Random();
        Random ra1 = new Random();
        Random ra2 = new Random();
        
        int sc = ra.nextInt(20) ;

        Etudiant e = new Etudiant("Gmini","Ahmed",5) ;
        Etudiant e1 = new Etudiant("Laabed","Hamid",18) ;
        Etudiant e2 = new Etudiant("Talbi","Karim",15) ;
        Etudiant e3 = new Etudiant("bad","sami",10) ;
        Etudiant e4 = new Etudiant("Book","bedro",12) ;
        Etudiant e5 = new Etudiant("Hadef","rami",4) ;

        Scanner scnn= new Scanner(System.in);
        System.out.println("Enter Size Of Table :");
        int vl = scnn.nextInt() ;

        Etudiant [] T = new Etudiant[]{e, e1, e2, e3, e4, e5} ;
        tableauiteratif ti = new tableauiteratif(T, Arrays.copyOf(T, T.length));
        
        Etudiant [] Table = ti.Ran(T, vl) ;
        tableauiteratif ti1 = new tableauiteratif (Table, Arrays.copyOf(Table , Table.length));


        ti.afficher(Table);
        System.out.println("********");
        ti.triebul();
        ti.afficchertrie(Table);

        System.out.println("********");

        ti1.afficher(Table);
        System.out.println("********");
        long startime = System.currentTimeMillis();
        ti1.triebul();
        long endtime = System.currentTimeMillis();
        ti1.afficchertrie(Table);

        System.out.println("The Time Of Execution Is : " +(endtime - startime + "  Ms"));
        System.out.println("********");

        System.out.println("Enter the Value Do You Want Searche :");
        int value = scnn.nextInt();

        System.out.println("********");
        System.out.println("The Result Of Search Is :  " + ti.RechSequ(ti1.TabTrie,value));
        System.out.println("The Result Of Search Is :  " + ti.RechDich(ti1.TabTrie,value,vl));
        
        System.out.println("********");
        System.out.println("Enter The Value Do You Want To Search : ");
        float val = scnn.nextFloat();

        System.out.println("********");
        ti1.AffiSup(Table , val);

    }
}
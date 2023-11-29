import java.util.Random;
import java.util.Scanner;

    public class tableauiteratif extends Tableaux {
  public tableauiteratif(Etudiant[]Tab,Etudiant []TabTrie){
  super(Tab, TabTrie);
   }
    @Override
    public void triebul () {
    int i , it ;
    Etudiant temp ;
    for (it=1 ;it<TabTrie.length ;it++){
        for (i=0 ; i<TabTrie.length-it ; i++){
            if (TabTrie[i].getscore() > TabTrie[i+1].getscore()) {
                temp = TabTrie[i] ;
                TabTrie[i] = TabTrie [i+1] ;
                TabTrie[i+1] = temp ; 
                
            }
        }
    }
    }

    public void triInsertion() {
        int i, iact;
        Etudiant act ;
        for (iact=1 ; iact<TabTrie.length ;iact++) {
            act = TabTrie[iact] ; 
            i = iact - 1 ;
            while (i>=0 && TabTrie[i].getscore() > act.getscore()) {
                TabTrie[i+1] = TabTrie[i] ;
                i-- ;
            }
            TabTrie[i+1] = act ;
        }
    }

    public void triSelection () {
    int i ,i_act ,i_min ;
    Etudiant min ;
    for (i_act = 0; i_act < TabTrie.length ;i_act++){
        min = TabTrie[i_act] ;
        i_min = i_act ;
        for (i=i_act+1 ;i<TabTrie.length ;i++){
            if (TabTrie[i].getscore() < min.getscore() ){
                min = TabTrie[i] ;
                i_min = i ;
            }
        }
        TabTrie[i_min] = TabTrie[i_act] ;
        TabTrie[i_act] = min ;
    }
    }

    public Etudiant[] Ran (Etudiant[] list , int vl){
        Random ran = new Random() ;
        Etudiant[] newlist = new Etudiant[vl];
        for (int i = 0 ; i< vl ; i++){
            newlist[i] = new Etudiant(null, null, i);
           int r = ran.nextInt(list.length);
           newlist[i].setnom(list[r].getnom());
           r = ran.nextInt(list.length);
           newlist[i].setprenom(list[r].getprenom());
           r = ran.nextInt(20);
           newlist[i].setscore(r);
        }
        return newlist;
    }

    public boolean RechSequ (Etudiant[] TabTrie, float vl){
        boolean res = false ;
        for (int i = 0 ; i<TabTrie.length ; i++) {
            if (TabTrie[i].getscore() == vl){
               res = true ;
            }
        }
        return res;
    }

    public boolean RechDich (Etudiant [] TabTrie, float vl, int d){
        boolean res = false ;
        int db = 1 ,fn = d ,ml ;
        while (db <= fn && res == false) {
            ml = (db + fn) /2 ;
            if ( TabTrie[ml].getscore() == vl){
                res = true ;
            }else{
                if (vl<TabTrie[ml].getscore()) {
                    fn = ml - 1 ;
                }else{
                    db = ml + 1 ;
                }
            }
        }
        return res ;
    }

    public void AffiSup (Etudiant [] TabTrie , float val ) {
        for (int i = 0 ; i< TabTrie.length ; i++) {
            if (TabTrie[i].getscore() >= val) {
                System.out.println(TabTrie[i].getnom() + "    " + TabTrie[i].getprenom() + "    " + TabTrie[i].getscore());
            }
        }
    }
 
    }
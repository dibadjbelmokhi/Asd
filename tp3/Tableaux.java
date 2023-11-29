public abstract class Tableaux{
    Etudiant[] Tab;
    Etudiant []TabTrie;
    
    public Tableaux (Etudiant[]Tab,Etudiant[] TabTrie){
        this.Tab=Tab ;
        this.TabTrie=TabTrie;
    }
    public void  afficher(Etudiant[] Tab){
   for(int i=0;i<Tab.length;i++){
     System.out.println(Tab[i].getnom()+"   "+Tab[i].getprenom()+"   "+Tab[i].getscore());
   }
    }
    public void afficchertrie( Etudiant[] TabTrie){
    for(int i=0;i<Tab.length;i++){
    System.out.println(TabTrie[i].getnom() + "   " + TabTrie[i].getprenom()+"   "+TabTrie[i].getscore());
}
    }

    public abstract void triebul ();
    public abstract void triSelection () ;
    public abstract  void triInsertion();

}
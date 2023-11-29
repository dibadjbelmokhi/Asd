
public class Etudiant {
  private String nom;
  private String prenom;
  private float score;
 public Etudiant(String nom,String prenom,float score){
this.nom=nom;
this.prenom=prenom;
this.score=score;
}
public String getnom(){
    return nom;
}
public String getprenom(){
    return prenom;
}
public float getscore(){
    return score;
}
public void setnom(String c){
    nom=c;
}
public void setprenom(String m){
    prenom=m;
}
public void setscore(float c){
    score=c;
}}
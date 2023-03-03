package conditionelle;

public class Produit {
private String titre;
private double prix;
private int quantite;
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public Produit(String titre, double prix, int quantite) {
	super();
	this.titre = titre;
	this.prix = prix;
	this.quantite = quantite;
}
public Produit() {
	super();
}

public double prixHt()
{
return this.prix*this.quantite;

}
public double taxe()
{

if(this.prixHt()<10000)
	return this.prixHt()*0.07;
else if(this.prixHt()<50000)
	return this.prixHt()*0.1;
else
	return this.prixHt()*0.14;
}
public double totaleT()
{
return prixHt()+taxe();	
}
@Override
public String toString() {
	return "Produit [titre=" + titre + ", prix=" + prix + ", quantite=" + quantite + ", prixHt=" + prixHt()
			+ ", taxe=" + taxe() + ", totale TTC=" + totaleT() + "]";
}


}

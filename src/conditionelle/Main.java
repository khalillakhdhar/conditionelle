package conditionelle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Codes c=new Codes();
		String parite=c.parite(6);
		System.out.println(parite);
		String divisibilite=c.divisibilite(365);
		System.out.println(divisibilite);
		Produit p=new Produit("TV LCD", 1200, 40);
		System.out.println(p.toString());
	}

}

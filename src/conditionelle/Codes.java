package conditionelle;

public class Codes {
public String parite(int x)
{
if(x%2==0)
{
return "paire";	
}
else
	return "impaire";
}
public String divisibilite(int x)
{
	// 366 =>3+6+6 
	int c=x/100; //3
	int d= (x%100)/10; //6
	int u=x%10; //6
	int somme=c+d+u;
	if(somme%3==0)
		return "divisible";
	else
		return "non divisible";
	
	
}
}

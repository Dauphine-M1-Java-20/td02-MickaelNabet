package Exo1exo2;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Mere mere = new Mere();
		System.out.println(mere.meth);
		mere.printMeth(); 
		
		Fille fille = new Fille();
		System.out.println(fille.meth); 
		fille.printMeth(); 
		
		Mere mereFille = new Fille(); 
		System.out.println(mereFille.meth); 
		mereFille.printMeth(); 
		
	
		/*mere.miage();
		fille.miage();
		mereFille.miage();
		((Fille)mereFille).miage();*/
		
		mere.a();
		mereFille.a();
		fille.a();
		((Mere)mereFille).a();
		 mereFille.b(null);
	
		 mereFille.c();
		 mereFille.c(mere);
		 mereFille.c(mereFille);
		 mereFille.c(fille);
		 fille.c(fille);
		
		 mere.d();
		 mereFille.d();
	
		 mere.printF();
		 mereFille.printF();
		
		 mereFille.j();
		 //mereFille.k();
		 mereFille.l();
		 mereFille.m();
		
	}
}

/*1.	Le main affiche dans l�ordre : 42, 42, 24, 24, 24, 24. 
 * Les 2 premiers 42 correspondent � l�instanciation de la classe Mere avec l�objet � mere �. 
 * Les quatre 24 sont les prints de deux objets � fille � et � mereFille � issus de la classe Fille. 
 * Prenons l�objet � mere � du Main. Il fait appel aux m�thodes de la classe M�re meth() et printMeth(), respectivement protected et public. 
 * Ensuite les objets � fille � et � mereFille � du Main font appel � la m�thode meth() de Fille et printMeth() de Mere. 
 * La classe Main a donc acc�s aux m�thodes de Mere et Fille pour cr�er et modifier des objets. 
 * Avec red�finition de meth() dans la classe Fille, elle print 24 et non 42.


2. Dans Fille, il a acc�s � deux m�thodes meth(), 
* celle de la classe m�re en utilisant le mot super dans une nouvelle m�thode printMeth, qui fait appel � la m�thode meth() de la classe m�re 
*et celle de la classe fille en �crivant fille2.meth().
* Dans le Main, c'est la m�me chose. On print la m�thode meth() de la classe Fille et celle de la classe Mere avec printMeth qui utilise le mot-cl� super.

3. Le main affiche 
 * 42 -> l'objet mere qui fait appel � meth() de la classe mere
 * 42 -> l'objet mere qui fait appel � printMeth() de la classe mere
 * 24 -> l'objet fille qui fait appel � meth de la classe fille
 * 42 -> l'objet fille qui fait appel � printMeth() de la classe Fille qui renvoit � la m�thode meth() de la classe Mere
 * 42 -> l'objet mereFille qui fait appel � meth() de la classe mere
 * 42 -> l'objet mereFille qui fait appel � printMeth() de la classe Mere
 * 
 * Les m�thodes static, cela n'intervient pas dans le fonctionnement de l'h�ritage
 * 
 * 4. Le main affiche :
 * 42
 * 42
 * 24
 * 42
 * 42
 * 42
 * 
 * 
 *Exercice 2 :
 *
 *1. Le main affiche :
 *Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The method miage() is undefined for the type Mere
	The method miage() is undefined for the type Mere
	The method k() from the type Mere refers to the missing type IOException 
 * 
 * Il faut d�finir la m�thode miage() et importer la IOEXCEPTION.
 * 
 *2. Je retire la m�thode miage() et k() en les mettant en commentaire.
 *
 *3. Une red�finition est diff�rente de la surcharge. Elle consiste � avoir deux m�thodes ayant le m�me type de retour et 
 *les m�mes param�tres et un niveau de visibilit� red�finie, r�parties dans la classe m�re et la classe fille.
 *Tandis qu'une surcharge, c'est aussi deux m�thodes dans la classe m�re et la classe fille, mais avec des types de retour et param�tres au moins diff�rents.
 *
 *4.
 *Mere_a -> est le r�sultat de la m�thode a() de la classe mere, sur l'objet mere instance de Mere
 *Fille_a -> est le r�sultat de la m�thode a() de la classe fille, sur l'objet mereFille instance de Fille
 *Fille_a -> est le r�sultat de la m�thode a() de la classe fille, sur l'objet fille instance de Fille
 *Fille_a -> est le r�sultat d'un cast de mereFille, instance de Fille, qui appelle donc a() de Fille
 *Fille_b(Fille) -> appel de b() de Fille, via mereFille instance de Fille
 *Mere_c -> appel de c() de Mere, via mereFille instance de Fille mais c() est seulement dans la classe m�re
 *Fille_c(Mere) -> appel de c(Fille) avec l'instance de Fille : mereFille
 *Fille_c(Mere) -> appel c(Mere) de la classe Fille sur mereFille de type Mere
 *Fille_c(Mere) -> appel de c(Fille) de Fille avec mereFille qui est une instance de fille
 *Fille_c(Fille) -> appel de c(Fille) avec fille qui est une instance de Fille
 *static Mere_d -> appel de d() de la classe Mere avec mere instance de Mere
 *static Mere_d -> appel de d() de la classe Mere avec mereFille instance de Fille mais de type Mere
 *Mere_f -> appel de printF() de Mere qui renvoie sur f() de Mere avec l'objet mere
 *Mere_f -> appel de printF() de Mere qui renvoie sur f() de Mere avec l'objet mereFille, instance de Fille mais de type Mere
 *Fille_j -> appel de j() de la classe Fille car mereFille est une instance de la classe Fille
 *Fille_l -> appel de l() de la classe Fille car mereFille est une instance de la classe Fille
 *Fille_m -> appel de m() de la classe Fille car mereFille est une instance de la classe Fille
 *
*/


 

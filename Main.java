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

/*1.	Le main affiche dans l’ordre : 42, 42, 24, 24, 24, 24. 
 * Les 2 premiers 42 correspondent à l’instanciation de la classe Mere avec l’objet « mere ». 
 * Les quatre 24 sont les prints de deux objets « fille » et « mereFille » issus de la classe Fille. 
 * Prenons l’objet « mere » du Main. Il fait appel aux méthodes de la classe Mère meth() et printMeth(), respectivement protected et public. 
 * Ensuite les objets « fille » et « mereFille » du Main font appel à la méthode meth() de Fille et printMeth() de Mere. 
 * La classe Main a donc accès aux méthodes de Mere et Fille pour créer et modifier des objets. 
 * Avec redéfinition de meth() dans la classe Fille, elle print 24 et non 42.


2. Dans Fille, il a accès à deux méthodes meth(), 
* celle de la classe mère en utilisant le mot super dans une nouvelle méthode printMeth, qui fait appel à la méthode meth() de la classe mère 
*et celle de la classe fille en écrivant fille2.meth().
* Dans le Main, c'est la même chose. On print la méthode meth() de la classe Fille et celle de la classe Mere avec printMeth qui utilise le mot-clé super.

3. Le main affiche 
 * 42 -> l'objet mere qui fait appel à meth() de la classe mere
 * 42 -> l'objet mere qui fait appel à printMeth() de la classe mere
 * 24 -> l'objet fille qui fait appel à meth de la classe fille
 * 42 -> l'objet fille qui fait appel à printMeth() de la classe Fille qui renvoit à la méthode meth() de la classe Mere
 * 42 -> l'objet mereFille qui fait appel à meth() de la classe mere
 * 42 -> l'objet mereFille qui fait appel à printMeth() de la classe Mere
 * 
 * Les méthodes static, cela n'intervient pas dans le fonctionnement de l'héritage
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
 * Il faut définir la méthode miage() et importer la IOEXCEPTION.
 * 
 *2. Je retire la méthode miage() et k() en les mettant en commentaire.
 *
 *3. Une redéfinition est différente de la surcharge. Elle consiste à avoir deux méthodes ayant le même type de retour et 
 *les mêmes paramètres et un niveau de visibilité redéfinie, réparties dans la classe mère et la classe fille.
 *Tandis qu'une surcharge, c'est aussi deux méthodes dans la classe mère et la classe fille, mais avec des types de retour et paramètres au moins différents.
 *
 *4.
 *Mere_a -> est le résultat de la méthode a() de la classe mere, sur l'objet mere instance de Mere
 *Fille_a -> est le résultat de la méthode a() de la classe fille, sur l'objet mereFille instance de Fille
 *Fille_a -> est le résultat de la méthode a() de la classe fille, sur l'objet fille instance de Fille
 *Fille_a -> est le résultat d'un cast de mereFille, instance de Fille, qui appelle donc a() de Fille
 *Fille_b(Fille) -> appel de b() de Fille, via mereFille instance de Fille
 *Mere_c -> appel de c() de Mere, via mereFille instance de Fille mais c() est seulement dans la classe mère
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


 

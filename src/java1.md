set PATH=C:\jdk-17.0.6\bin;PATH
### cours de java

public class Index {
    public static void main(String[]args)
}

javac Index.java pour compiler le code,

jvm:java virtual machine => petit programme qui s'execute dans la mémoire ram.. convertit le code source en byte code

jre: java runtime environnement=>environnement d'execution java , programmes qui contient souvent une jvm et c'est a ce niveau que nous avons nos librairies;

jdk: java developement kit; qui contient generalement le javac 
jdk = jvm + jre +javac +java

types de données:
types primitif et non primtifs

types primitifs:  int, float,char, boolean,
dans les int nous avons( byte, short, Int, Long )
nombres décimaux( float, double )

quitter des types inferieur vers des types superieur se fait aisément mais le contraire utilise le modulo.

plus petite unité de mesure est le bit ;
byte est l'appelation anglaise de octet en francais.
8bit = 1byte = 1octet ;

conversion implicite = quiiter d'une petit a une plus grande.

autre manière de déclarer des variables:
int b = 0b 100010; permet de déclarer une valeur binaire;
int y = 0x ff;// permet de déclarer des nombres hexadécimales ;

desormais en java on crée les dossiers suivant 
-bin
-lib (ici on a les librairies );

-src( et c'est ici que on a nos fichier java par exemple Main.java );

dans notre exemple dans src on a le dossier bj qui contient le dossier highfive qui contient le dossier wip et dans ce dossier wip nous avons notre fichier Main.java

code source des librairies par défaut c'est souvent .jar;

On crée aussi un dossier .vscode et dans ce dossier on crée un fichier settings.json qui contient les lignes de code suivant:
{
    "java.project.source.paths":["src"],
    "java.project.outputPath":"bin",
    "java.project.referencedLibrairies":["lib/**/*/.jar"],
}
 
###  des abréviations en java
main ==>
ctor ==> genere un constructeur;
Sout/Sysout ==> System.out.println();
prf ==> declarer une variable private
public_method  ==> methode public
private_method ==> methode private
protected_method ==> protected method
if, ifelse
foreach, for i
while, do while

if (condition){
  // instruction
}else{
 // instruction si condition faux
};

for(statment1; statement2; statement3){

};

declarer un tableau:
int[ ] arr2 = new int[5];
        arr2[0]=1;
        arr2[1]=2;
        arr2[2]=3;
        arr2[3]=4;
        arr2[4]=5;
 for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
 int [ ] arr3 = {6,7,8,9};
for(int num : arr3){
            System.out.println(num);
        }
nous avons aussi les instructions break; et continue....

break sors de la boucle
continue arrete a la valeur souhaité et poursuit...

PROGRAMMATION ORIENTE OBJET JAVA:
consiste a utiliser des classes pour coder;
classe c'est une collection d'objet

heritage : ou(synomyme acquerir)==> les caracterisques ou proprieté d'une autre classe

polymorphisme: poly et morphe ou encore plusieurs forme; avoir differente comportement dans certaine situation

classe abstraite: classe non instanciable qui sert de model a ses enfants mais qui peut etre hérité.
encapsulation: permet de mettre le code dans un seul unité;


ctrl shift p et ensuite java create project et ensuite run build tools puis on crée notre dossier;

on créé une classe Person avec des mebres en mode private;
pour generer les getters et setters; on fait un clic droit sur vs code ensuite on vas sur source action et on choisit generate setters and getters....

overloading:
methode repeter plusieur fois avec different parametre;  
cest une sorte de polymorphisme;
public function add (int a, int b ){  }

public function add ( float a, float b) { }

il faut regarder
type de retour, nom de methode, argument

on regarde surtout le type et le nom des parametres

 private String firstName;
    private String lastName;
    private int age;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int present(String age){
        return 10;
    }
    ;
    public String present(int a){
        return "";
    }
    public Person() {
    }
    public Person(String firstName) {
        this.firstName = firstName;
    }
    public Person(int age) {
        this.age = age;
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    VARIABLE STATIC;
initialisation des variables static;

static{
foot = 2;
System.out.println(
}

-overload :  permet d'ameliorer la lisibilité du code;

-override (les parametres doivent etres identiques ) :  fournir une implementation spécifique d'une methode deja fournis dans la superclasse ie dans la classe parente.

-overload( ici les parametres doivent etre differents ) s'effectue dans la meme classe alors que le override s'effectue en deux classes ayant une relation d'heritage

-le overload ne peut etre effectué en changeant uniquement le type de retour ; le type de retour peux etre identique ou différent ; mais nous devons changer les paramètres.

au niveau de l'override le type de retour doit etre identique ;



LE MOT CLEF FINAL :

mis derrieres un champ on ne peut plus modifier le champ; il la rend constante ;
exemple: 
Person { 
final private String name = "john" ;
}

final dit que la methode est finale donc on ne peut plus la modifier ;

Une classe B ne peut plus hérité d'une classe A qui est finale ...

Une agrégation est une forme d'association qui traduit une relation de type "a"; entre deux objet.
Exemple: Une personne a deux addresse;

Pour etre considerer comme une agrégation, un objet et ses membres doivent avoir la relation suivante
1- le membre fais partit de l'objet;
2- le membr peux appartenir aplus d'"un objet
3- le membre , n'a pas son existence gérer par l'objet;


LE MOT CLEF SUPER :
s'utilise sur les champs, methodes et constructeur;
super apeler comme une function dit qu'il appel le constructeur du parent
super() => on appel le constructeur du parent;
super.y => on appel le champ du parent;
super.y() => on appel la methode y du parent;


LE BLOC D'INSTANCE ou BLOC D'INITILAISATION D'INSTANCE

{
}  => appelé bloc d'instance et sont utilisé pour initialiser les membres;

static {
} => appelé bloc static 

le bloc d'initialisation d'instance ou bloc d'instance est un bloc de code qui permet d'initialiser les champs non static;
il a principalement trois règles pour un bloc d'instance
-> le bloc d'instance est executé lors de l'initialisation de la classe
-> le bloc d'instance est executé après le constructeur de la superclasse
->les bloc d'instance s'executent dans l'odre dans lesquels ils apparaissent

LES MODIFICATEURS D'ACCES
mot clef qui permet de changer la portée ou la visibilitré d'un champ, d'une méthode ou d'une classe
on a : private, default, protected, public ;

-public : devant un champ, une  methode ou une classe on peut avoir accès a ses champs, methode et classe de partout

-protected : placée derriere un champ ou une methode est accessible dans la meme classe et les sous-classes!

-defaut : placé derriere un champ, methode genere une erreur donc un champ, methode, ou la class ou la sous-classe

-private : placé derriere un membre, methode ou classe entraine qu'on ne peut avoir accès a l'interieru de la classe



                          classe               package                sous-classe hors package             hors package

private                   v                        x                                         x                                           x


default                   v                        v                                         x                                            x


protected               v                         v                                        v                                            x


public                     v                         v                                         v                                           v



Une classe abstraite est reconnu par le mot clef abstract
elle eput avoir en son sein des methods abstract ou non
elle ne peut pas etre instancié
elle peut contenir des methodes final
elle peut avoir des constructeurs et des methodes statiques
exemple:
abstract class Shape {
abstract void draw();
}

class Rect extends Shape{ void draw() }

INTERFACES 



yjf,hjfhjf,hjfhf








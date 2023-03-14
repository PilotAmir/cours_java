package bj.highfive;
import bj.highfive.Adress;
public class Person {
   
private String firstName;
private String lastName;
private int age;
private Adress adress;
public int fingers;
final String profession = "Codeur";

public Person(String firstName, String lastName, int age, Adress adress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.adress = adress;
}

public Person() {
    System.out.println("le constructeur");
}
static{
    System.out.println("bloc statique");
}

{
    System.out.println("bloc d'instance");
}




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





public Adress getAdress() {
    return adress;
}





public void setAdress(Adress adress) {
    this.adress = adress;
}





final public void present(){
    System.out.println("Bonjour à tous je suis John");
    this.adress.showAdress();
}

public Person(String firstName, String lastName, int age, Adress adress, int fingers) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.adress = adress;
    this.fingers = fingers;
}



}

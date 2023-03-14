package bj.highfive;

public class Adress {
    private String country;
    private String city;

    public Adress(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void showAdress(){
        System.out.println("j'habite à " + this.getCountry());
        
    }

}

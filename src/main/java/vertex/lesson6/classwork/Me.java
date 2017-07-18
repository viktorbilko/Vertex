package vertex.lesson6.classwork;

/**
 * Created by vertex0005 on 18.07.2017.
 */
public class Me {

    private String name;
    private String surname;
    private String city;
    private boolean beer;

    public Me() {
        System.out.println("No parametrs");
    }

    public Me(String name) {
        this.name = name;
    }

    public Me(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Me(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public Me(String name, String surname, String city, boolean beer) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.beer = beer;
    }



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isBeer() {
        return beer;
    }

    public void setBeer(boolean beer) {
        this.beer = beer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}

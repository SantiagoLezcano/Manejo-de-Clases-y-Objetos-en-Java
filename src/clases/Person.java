
package clases;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Representa una persona con sus datos basicos
 * @Author: SANTIAGO
 */
public class Person {
    /**
     * Atributos
     */
    private String identificationDocument;
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float Height;
    SimpleDateFormat dsf= new SimpleDateFormat("dd/mm/yyyy");


    public Person(String identificationDocument, String name, String lastName1, String lastName2, Date dateBirth, float height) {

        this.identificationDocument = identificationDocument;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth= dateBirth;
        Height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "identificationDocument='" + identificationDocument + '\'' +
                ", name='" + name + '\'' +
                ", lastName1='" + lastName1 + '\'' +
                ", lastName2='" + lastName2 + '\'' +
                ", dateBrith=" + dateBirth +
                ", Height=" + Height +
                '}';
    }
}

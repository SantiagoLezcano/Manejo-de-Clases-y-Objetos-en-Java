package clases;

import java.util.ArrayList;
/**
 * Representa una fruta con su nombre,
 * @Author: SANTIAGO
 */
public class Fruit {
    /**
     * Atributos
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /**
     * Constructor con parametros
     * @param name
     * @param averageWeight
     * @param colors
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Getter and Setter
     * @return
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * To String
     * @return
     */
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", averageWeight=" + averageWeight +
                ", colors=" + colors +
                '}';
    }
}

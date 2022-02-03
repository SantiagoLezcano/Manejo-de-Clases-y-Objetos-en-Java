package clases;

import java.util.ArrayList;
/**
 * Representa un animal con su nombre, numero de patas, tamaño y comportamiento
 * @Author: SANTIAGO
 */
public class Animal {
    /**
     * Atributos
     */
    public String name;
    public short numberOfLegs;
    public String size;
    public ArrayList<String> typeAnimals;//vertebrados, invertebrados,antropodos...etc
    private String behavior;//Agresivos,sociables,solitarios.

    /**
     * Constructor con parametros
     * @param name
     * @param numberOfLegs
     * @param size
     * @param typeAnimals
     * @param behavior
     */
    public Animal(String name, short numberOfLegs, String size, ArrayList<String> typeAnimals, String behavior) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.size = size;
        this.typeAnimals = typeAnimals;
        this.behavior = behavior;
    }

    /**
     * Getters and Setters
     * @return
     */
    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    /**
     * Metodo to String
     * @return
     */
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", size='" + size + '\'' +
                ", typeAnimals=" + typeAnimals +
                ", behavior='" + behavior + '\'' +
                '}';
    }

    /**
     * Este metodo da el comportamiento de acuerdo al animal que le enviemos
     * @param animal
     * @return
     */
    public String animalBehavior(Animal animal){
        behavior=animal.getBehavior();
        return behavior;
    }

}

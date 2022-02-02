package clases;

import java.util.ArrayList;

public class Animal {
    /**
     * Representa un animal con su nombre, numero de patas, tamaño y comportamiento
     * @Author: SANTIAGO
     */
    public String name;
    public short numberOfLegs;
    public String size;
    public ArrayList<String> typeAnimals;//vertebrados, invertebrados,antropodos...etc
    private String behavior;//Agresivos,sociables,solitarios.

    public Animal(String name, short numberOfLegs, String size, ArrayList<String> typeAnimals, String behavior) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.size = size;
        this.typeAnimals = typeAnimals;
        this.behavior = behavior;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

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

}

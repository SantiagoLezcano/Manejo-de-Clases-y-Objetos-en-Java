package clases;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Prueba de todas las clases
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        personTest("26/11/1999");
        fruitTest();
        bankAccountTest();
        animalTest();
        computerTest();
        bookTest();
    }
    /**
     * Prueba de persona
     */

    public static void personTest(String dateAss) throws ParseException {
        SimpleDateFormat dsf= new SimpleDateFormat("dd/MM/yyyy");
        String dateAssitant=dateAss;
        Date dateBirth=dsf.parse(dateAssitant);
        System.out.println(" PERSON TEST");
        Person person = new Person("1123","Santiago","Lezcano","Martínez",dateBirth,170);
        System.out.println(person.toString());
    }
    /**
     * Prueba de Fruta
     */
    public static void fruitTest(){
        System.out.println("FRUIT TEST");
        ArrayList<String> colors;
        colors= new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        Fruit fruit =new Fruit("Apple",13,colors);
        System.out.println(fruit.toString());
    }
    /**
     * Prueba de Cuenta Bancaria
     */
    public static void bankAccountTest(){
        System.out.println("BANK ACCOUNT TEST");
        BankAccount bank_account = new BankAccount(2121321234,true);
        bank_account.statusAccount(bank_account.activated);
        System.out.println(bank_account.toString());
    }
    /**
     * Prueba de Animal
     */
    public static void animalTest(){
        System.out.println("ANIMAL TEST");
        ArrayList<String> typeAnimals;
        typeAnimals= new ArrayList<String>();
        typeAnimals.add("Vertebrates");
        typeAnimals.add("Invertebrates");
        typeAnimals.add("Atropods");
        typeAnimals.add("Mollusks");
        Animal animal= new Animal("Leon", (short) 4,"grande",typeAnimals,"Aggressive");
        System.out.println(animal.toString());
    }
    /**
     * Prueba Computador
     */
    public static void computerTest(){
        System.out.println("COMPUTER TEST");
        Computer computer= new Computer(15,"Asus","123ASJ23","Ryzen 7","DDR4", (short) 16,false);
        System.out.println(computer.toString());
    }
    /**
     * Prueba de Libro
     */
    public static void bookTest(){
        System.out.println("BOOK TEST");
        Book book = new Book("Harry Potter","12AB23",(short)1300,"j.k. Rowling","Universal");
        System.out.println(book.toString());
    }
}

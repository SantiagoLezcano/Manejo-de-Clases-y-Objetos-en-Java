package clases;
/**
 * Esta clase representa un libro
 * @author SANTIAGO
 */
public class Book {

    public String name;
    private String ISBN;//International Standard Book Number - Número Internacional Normalizado de Libros
    public short numberOfPages;
    public String author;
    public String published;//Quien lo publica Editorial

    public Book(String name, String ISBN, short numberOfPages, String author, String published) {
        this.name = name;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.published = published;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", published='" + published + '\'' +
                '}';
    }
}

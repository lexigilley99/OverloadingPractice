package org.example;

public class Main2 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Tank", true);
        Animal animal2 = new Animal("Cleo");
        Animal animal3 = new Animal(true);
        Animal animal4 = new Animal();

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);

        Books book1 = new Books("1984", 328, 1949);
        Books book2 = new Books("To Kill a Mockingbird", 281);
        Books book3 = new Books("The Great Gatsby");
        Books book4 = new Books();

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        TvShow show1 = new TvShow("Breaking Bad", 62, "Comedy");
        TvShow show2 = new TvShow("Friends", 236);
        TvShow show3 = new TvShow("The Office");
        TvShow show4 = new TvShow();

        System.out.println(show1);
        System.out.println(show2);
        System.out.println(show3);
        System.out.println(show4);
    }
}

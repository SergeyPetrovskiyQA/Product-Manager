package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductManagerTest {
    @Test
    public void testAdd() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter", 100, "Joanne Rowling");
        Book book2 = new Book(2, "Beautiful world, where are you", 200, "Anna Babyashkina");
        Book book3 = new Book(3, "Steppe", 300, "Oksana Vasyakina");
        Smartphone phone1 = new Smartphone(4, "Iphone 14", 500, "Apple");
        Smartphone phone2 = new Smartphone(5, "Galaxy S3", 400, "Samsung");
        Smartphone phone3 = new Smartphone(6, "Redmi 1", 300, "Xiaomi");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);
        manager.add(phone2);
        manager.add(phone3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3, phone1, phone2, phone3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void notAdd() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter", 100, "Joanne Rowling");
        Book book2 = new Book(2, "Beautiful world, where are you", 200, "Anna Babyashkina");
        Book book3 = new Book(3, "Steppe", 300, "Oksana Vasyakina");
        Smartphone phone1 = new Smartphone(4, "Iphone 14", 500, "Apple");
        Smartphone phone2 = new Smartphone(5, "Galaxy S3", 400, "Samsung");
        Smartphone phone3 = new Smartphone(6, "Redmi 1", 300, "Xiaomi");


        Product[] actual = repo.findAll();
        Product[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void searcheByTest() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter", 100, "Joanne Rowling");
        Book book2 = new Book(2, "Beautiful world, where are you", 200, "Anna Babyashkina");
        Book book3 = new Book(3, "Steppe", 300, "Oksana Vasyakina");
        Smartphone phone1 = new Smartphone(4, "Iphone 14", 500, "Apple");
        Smartphone phone2 = new Smartphone(5, "Galaxy S3", 400, "Samsung");
        Smartphone phone3 = new Smartphone(6, "Redmi 1", 300, "Xiaomi");



        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);
        manager.add(phone2);
        manager.add(phone3);


        Product[] actual = manager.searchBy("Iphone");
        Product[] expected = {phone1};
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void searcheTwo() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter", 100, "Joanne Rowling");
        Book book2 = new Book(2, "Beautiful world, where are you", 200, "Anna Babyashkina");
        Book book3 = new Book(3, "Steppe", 300, "Oksana Vasyakina");
        Smartphone phone1 = new Smartphone(4, "Iphone 14", 500, "Apple");
        Smartphone phone2 = new Smartphone(5, "Galaxy S3", 400, "Samsung");
        Smartphone phone3 = new Smartphone(6, "Iphone 11", 300, "Apple");


        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);
        manager.add(phone2);
        manager.add(phone3);


        Product[] actual = manager.searchBy("Iphone");
        Product[] expected = {phone1, phone3};
        Assertions.assertArrayEquals(actual, expected);


    }
    @Test
    public void notSearche(){
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter", 100, "Joanne Rowling");
        Book book2 = new Book(2, "Beautiful world, where are you", 200, "Anna Babyashkina");
        Book book3 = new Book(3, "Steppe", 300, "Oksana Vasyakina");
        Smartphone phone1 = new Smartphone(4, "Iphone 14", 500, "Apple");
        Smartphone phone2 = new Smartphone(5, "Galaxy S3", 400, "Samsung");
        Smartphone phone3 = new Smartphone(6, "Iphone 11", 300, "Apple");


        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);
        manager.add(phone2);
        manager.add(phone3);


        Product[] actual = manager.searchBy("Nokia");
        Product[] expected = {};
        Assertions.assertArrayEquals(actual, expected);

    }
}

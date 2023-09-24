package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Таинственный остров", 500);
        Book book2 = new Book("Гарри Поттер", 1000);
        Book book3 = new Book("Властелин колец", 900);
        Book book4 = new Book("Clean code", 100);
        Book[] libr = new Book[4];
        libr[0] = book;
        libr[1] = book2;
        libr[2] = book3;
        libr[3] = book4;
        for (Book bk : libr) {
            System.out.println(bk.getName() + " - " + bk.getCount() + " стр. ");
        }
        Book temp = libr[0];
        libr[0] = libr[3];
        libr[3] = temp;
        for (Book bk : libr) {
            System.out.println(bk.getName() + " - " + bk.getCount() + " стр. ");
        }
        for (int i = 0; i < libr.length; i++) {
            libr[i] = book4;
            Book bk = libr[i];
            System.out.println(bk.getName() + " - " + bk.getCount() + " стр. ");
        }
    }
}

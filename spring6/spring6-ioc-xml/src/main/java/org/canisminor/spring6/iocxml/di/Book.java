package org.canisminor.spring6.iocxml.di;

public class Book {
    private String name;
    private String author;

    private String others;

    public Book() {
        System.out.println("无参数构造方法执行了");
    }

    public Book(String name, String author) {
        System.out.println("有参数构造方法执行了");
        this.name = name;
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getOthers() {
        return others;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }
}

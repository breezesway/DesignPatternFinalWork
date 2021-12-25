package com.cgz.bean;

public class Book implements Cloneable{

    private String name;
    private String publishDate;
    private String publisher;
    private int pagenumber;

    public Book() {
    }

    public Book(String name, String publishDate, String publisher, int pagenumber) {
        this.name = name;
        this.publishDate = publishDate;
        this.publisher = publisher;
        this.pagenumber = pagenumber;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPagenumber() {
        return pagenumber;
    }

    public void setPagenumber(int pagenumber) {
        this.pagenumber = pagenumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pagenumber=" + pagenumber +
                '}';
    }
}

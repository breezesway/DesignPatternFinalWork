package com.cgz.library;

import com.cgz.bean.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {

    private HashMap<String, ArrayList<Book>> allBooks = new HashMap<>();

    public Library() throws CloneNotSupportedException {
        ArrayList<Book> books = new ArrayList<>();
        Book dataStructure = new Book("数据结构", "2010.12.14", "清华大学出版社", 322);
        books.add(dataStructure);
        books.add(dataStructure.clone());
        books.add(dataStructure.clone());
        books.add(dataStructure.clone());
        allBooks.put("数据结构",books);
        books.clear();
        Book operationSystem = new Book("操作系统", "2012.6.15", "清华大学出版社", 288);
        books.add(operationSystem);
        books.add(operationSystem.clone());
        books.add(operationSystem.clone());
        books.add(operationSystem.clone());
        allBooks.put("操作系统",books);
        books.clear();
        Book softwareEngining = new Book("软件工程", "2008.8.21", "清华大学出版社", 385);
        books.add(softwareEngining);
        books.add(softwareEngining.clone());
        books.add(softwareEngining.clone());
        books.add(softwareEngining.clone());
        allBooks.put("软件工程",books);
    }

    public int queryNum(String bookName){
        return allBooks.get(bookName).size();
    }

    public Book getDataStructure(){
        return allBooks.get("数据结构").get(0);
    }

    public Book getOperationSystem(){
        return allBooks.get("操作系统").get(0);
    }

    public Book getSoftwareEngining(){
        return allBooks.get("软件工程").get(0);
    }

}

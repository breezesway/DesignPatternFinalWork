package com.cgz.library;

import com.cgz.bean.Book;

public class Librarian {

    private Library library;

    public Librarian() throws CloneNotSupportedException {
        library = new Library();
    }

    public Book borrowBook(String bookName){
        int num = library.queryNum(bookName);
        if(num==0){
            System.out.println("该书已被借完啦！！");
            return null;
        }
        Book book;
        if("数据结构".equals(bookName)){
            book = library.getDataStructure();
        }else if("操作系统".equals(bookName)){
            book = library.getOperationSystem();
        }else {
            book = library.getSoftwareEngining();
        }
        return book;
    }

}

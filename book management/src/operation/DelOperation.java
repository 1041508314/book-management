package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/11
 * @Content:
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除图书的名字：");
        String name = scanner.nextLine();
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
               break;
            }
        }
        if(i == bookList.getUsedSize()){
            System.out.println("没有这本书！");
            return;
        }

        for (int pos = i; pos < bookList.getUsedSize()-1 ; pos++) {
            Book book = bookList.getBook(pos+1);
            bookList.setBooks(pos,book);
        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
    }
}

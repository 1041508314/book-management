package operation;

import book.Book;
import book.BookList;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/11
 * @Content:
 */
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}

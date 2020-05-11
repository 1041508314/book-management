package operation;

import book.BookList;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/11
 * @Content:
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);

    }
}

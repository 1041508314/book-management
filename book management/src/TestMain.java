import book.Book;
import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/11
 * @Content:
 */
public class TestMain {
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1--> 管理员   2--> 普通用户");
        int choice = scanner.nextInt();
        if(choice == 1){
            return new Admin(name);
        }else{
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();
        //准备登录
        User user = login();
        while(true){
            int choice = user.menu();
            //选择是几 就可以调用对应的方法
            user.doOperation(bookList , choice);
            
        }
    }
}

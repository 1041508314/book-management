package book;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/11
 * @Content:
 */
public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;

    public BookList(){
        books[0] = new Book("三国演义","罗贯中" ,50,"小说");
        books[1] = new Book("水浒传","施耐庵",39,"小说");
        books[2] = new Book("西游记","吴承恩",40,"小说");
        this.usedSize = 3;
    }
    public void setBooks(int pos,Book book){
        this.books[pos] = book;
    }
    public Book getBook(int pos){
        return this.books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}

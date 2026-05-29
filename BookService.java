/**
 * 书籍服务类
 * 用于Git实验测试
 */
public class BookService {
/** 123456789*/
    /**
     * 获取所有书籍列表
     * @return 书籍列表字符串
     */
    public String getAllBooks() {
        return "Java编程思想, Spring实战, Git权威指南";
    }

    public static void main(String[] args) {
        BookService service = new BookService();
        System.out.println("书籍列表：" + service.getAllBooks());
    }
}
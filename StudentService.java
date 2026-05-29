/**
 * 学生服务类
 * 用于Git实验测试
 */
public class StudentService {

    /**
     * 获取所有学生姓名
     * @return 学生姓名列表
     */
    public String getAllStudents() {
        return "张三, 李四, 王五";
    }

    public static void main(String[] args) {
        StudentService service = new StudentService();
        System.out.println("学生列表：" + service.getAllStudents());
    }
}
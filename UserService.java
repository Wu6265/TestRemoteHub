/**
 * 用户服务类
 * 用于Git实验测试
 */
public class UserService {

    /**
     * 获取所有用户名
     * @return 用户名列表
     */
    public String getAllUsers() {
        return "admin, user1, user2";
    }

    public static void main(String[] args) {
        UserService service = new UserService();
        System.out.println("用户列表：" + service.getAllUsers());
    }
}
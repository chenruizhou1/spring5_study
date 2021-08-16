package service;

import model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author chenruizhou
 */
@Service
public class UserService {

    @Value("chenruizhou")
    private String by;

    private final User user;
    public UserService(User user) {
        this.user = user;
    }
 
    public void addUser() {
        System.out.println(user.toString());
        System.out.println("添加用户成功！" + " " + "by：" + this.by);
    }

}

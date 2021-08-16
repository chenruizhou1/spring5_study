package model;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() {
        User user = new User();
        user.setUserName("光辉");
        user.setAge(16);
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

}

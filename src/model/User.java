package model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author chenruizhou
 */
@Component
public class User {

    private String userName;
    private Integer age;

    private String[] skills;
    private List<String> clothes;
    private Map<String, String> friends;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public List<String> getClothes() {
        return clothes;
    }

    public void setClothes(List<String> clothes) {
        this.clothes = clothes;
    }

    public Map<String, String> getFriends() {
        return friends;
    }

    public void setFriends(Map<String, String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", skills=" + Arrays.toString(skills) +
                ", clothes=" + clothes +
                ", friends=" + friends +
                '}';
    }

}

package model;

/**
 * @author chenruizhou
 * @date 2021/8/16
 * 实现AOP使用类
 */

public class Equipment {

    private String id;
    private String name;
    private String type;
    private String level;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void print() {
        System.out.println(this.name + "|" + this.type + "|" + this.level);
    }

}

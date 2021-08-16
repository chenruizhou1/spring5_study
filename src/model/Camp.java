package model;

/**
 * 测试bean生命周期使用类
 */
public class Camp {

    private String campName;

    public Camp() {
        System.out.println("1---通过无参构造方法创建bean实例");
    }

    public void setCampName(String campName) {
        this.campName = campName;
        System.out.println("2---调用set方法，为bean的属性设置值（属性注入）");
    }

    /**
     * 自定义
     * bean的初始化方法
     * 在xml配置文件里面进行配置
     * init-method="initMethod"
     */
    public void initMethod() {
        this.campName = "铁血";
        System.out.println("3---调用bean的初始化方法");
    }

    /**
     * 自定义
     * bean的销毁方法
     * 在xml配置文件里面进行配置
     * destroy-method="destroyMethod"
     */
    public void destroyMethod() {
        System.out.println("5---调用bean的销毁方法");
    }

    @Override
    public String toString() {
        return "Camp{" +
                "campName='" + campName + '\'' +
                '}';
    }
}
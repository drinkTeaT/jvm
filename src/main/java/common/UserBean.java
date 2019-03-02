package common;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-01-07 21:35
 **/
public class UserBean {
    private String name;
    private int age;

    public UserBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("UserBean 已失联!");
    }
}

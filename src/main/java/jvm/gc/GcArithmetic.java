package jvm.gc;

import common.UserBean;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description：算法集
 * @Author： Administrator
 * @Date： 2019-01-05 11:45
 **/
public class GcArithmetic {

    public GcArithmetic instance;

    /**
     * 打脸"引用计数算法"
     * 引用计数算法：实例被引用，计数器加一，引用赋值为其他引用该引用减一，为零回收
     */
    public void countArithmetic() {
        // 引用加一
        GcArithmetic gcArithmetic = new GcArithmetic();
        GcArithmetic gcArithmetic1 = new GcArithmetic();
        // 启用gc回收，按照道理应该不会回收，因为引用不为零
        gcArithmetic.instance = gcArithmetic1;
        gcArithmetic1.instance = gcArithmetic;
        gcArithmetic = null;
        gcArithmetic1 = null;
        System.gc();
    }

    /**
     * 新建一个对象，放入list里面，将对象的引用置为null
     */
    public void classInList(){
        UserBean userBean = new UserBean("tom",12);
        List<UserBean> beanList = new ArrayList<>();
        beanList.add(userBean);
        userBean = null;
        beanList = null; //userBean彻底失联
        System.gc();
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("GcArithmetic 已失联!");
    }
}

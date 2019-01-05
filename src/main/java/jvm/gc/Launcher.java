package jvm.gc;

import factory.Factory;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-01-05 11:45
 **/
public class Launcher {
    public static void main(String[] args){
        GcArithmetic gcArithmetic = Factory.createGc();
        gcArithmetic.countArithmetic();
    }
}

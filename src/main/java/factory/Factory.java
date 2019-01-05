package factory;

import jvm.gc.GcArithmetic;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-01-05 12:04
 **/
public class Factory {
    public static GcArithmetic createGc(){
        return new GcArithmetic();
    }
}

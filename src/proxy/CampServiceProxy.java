package proxy;

import service.impl.CampServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author chenruizhou
 * @date 2021/8/11
 */
public class CampServiceProxy implements InvocationHandler {

    private final CampServiceImpl campService;
    public CampServiceProxy(CampServiceImpl campService) {
        this.campService = campService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("在执行方法之前执行");
        System.out.println("==========开始执行" + method + "方法==========");
        System.out.println("参数" + Arrays.toString(args));
        System.out.println("-------------------");
        Object invoke = method.invoke(campService, args);
        System.out.println("-------------------");
        System.out.println("==========" + method + "方法执行结束==========");
        System.out.println("在执行方法之后执行");
        return invoke;
    }

}

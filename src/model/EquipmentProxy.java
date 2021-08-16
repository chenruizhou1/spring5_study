package model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author chenruizhou
 * @date 2021/8/16
 */

@Aspect
public class EquipmentProxy {

    @Before(value = "execution(* model.Equipment.print(..))")
    public void before() {
        System.out.println("这是一个前置方法");
    }

    @After(value = "execution(* model.Equipment.print(..))")
    public void after() {
        System.out.println("这是一个后置方法");
    }

    @Around(value = "execution(* model.Equipment.print(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("这是一个环绕前置方法");
        Object proceed = pjp.proceed();
        System.out.println("这是一个环绕后置方法");
        return proceed;
    }

}

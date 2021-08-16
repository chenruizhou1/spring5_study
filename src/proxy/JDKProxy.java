package proxy;

import service.CampService;
import service.impl.CampServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author chenruizhou
 * @date 2021/8/11
 */
public class JDKProxy {

    public static void main(String[] args) {
        CampServiceImpl campService = new CampServiceImpl();
        CampService campService1 = (CampService) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), campService.getClass().getInterfaces(), new CampServiceProxy(campService));
        String str = "东煌：位于东方大陆但是「神州」历史悠久的古国，作为碧蓝航线阵营的成员，参与对塞壬和赤色中轴的作战任务。";
        campService.print(str);
        campService1.print(str);
    }

}

package ProxybyN0lan;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class exp {
    public static void main(String[] args){
        InvocationHandler handler = new expHandler(new HashMap());
        Map proxyMap=(Map)Proxy.newProxyInstance(Map.class.getClassLoader(),new Class[]{Map.class},handler);
        proxyMap.put("hi","sir");
        String re=(String)proxyMap.get("hi");
        System.out.println(re);
    }
}
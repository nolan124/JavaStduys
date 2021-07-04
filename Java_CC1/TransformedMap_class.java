import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.map.TransformedMap;

import java.util.HashMap;
import java.util.Map;

public class TransformedMap_class {
    public static void main(String[] args) throws Exception{
        Map innerMap = new HashMap();
        innerMap.put("N0lan", "value");
        Map outerMap = TransformedMap.decorate(innerMap, new Hello(), new Hello1());
        Map.Entry onlyElement = (Map.Entry) outerMap.entrySet().iterator().next();
        onlyElement.setValue("foobar");
    }
}
class Hello implements Transformer {
    @Override
    public Object transform(Object input) {
        System.out.println(input.toString());
        return "Hello";
    }
}


class Hello1 implements Transformer {
    @Override
    public Object transform(Object input) {
        System.out.println(input.toString());
        return "Hello1";
    }
}
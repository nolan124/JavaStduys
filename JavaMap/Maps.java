
import java.util.*;

public class Maps {
    public static void main(String[] args){
       /* Map<String,String> myMap=new HashMap<String,String>();
        myMap.put("N0lan","tryup");
        myMap.put("Cors","study");//add
        System.out.println(myMap);
        myMap.remove("N0lan");//delete
        System.out.println(myMap.get("Cors"));//find
        System.out.println(myMap.isEmpty());//panduan
        System.out.println(myMap.containsKey("Hello"));//*/
        Entryt();
    }
    /*public static void Bianli(){
        Map<String,String> myMap=new HashMap<String,String>();
        myMap.put("N0lan","tryup");
        myMap.put("III","tryups");
        myMap.put("Cors","study");//add
        //
        // 获取方法：
        // 第一种方式: 使用keySet
        // 需要分别获取key和value，没有面向对象的思想
        // Set<K> keySet() 返回所有的key对象的Set集合
        Set<String> keyvaule= myMap.keySet();
        Iterator<String> keys=keyvaule.iterator();
        while(keys.hasNext()){
            String key=keys.next();
            String vaule=myMap.get(key);
            System.out.println("key=" + key + " vaule=" + vaule);
        }
    }*/
/*
    public static void Onlvalue(){
        Map<String,String> myMap=new HashMap<String,String>();
        myMap.put("N0lan","tryup");
        myMap.put("III","tryups");
        myMap.put("Cors","study");//add
        Collection<String> valuess= myMap.values();
        Iterator<String> it=valuess.iterator();
        while(it.hasNext()){
            String value= it.next();
            System.out.println(" value=" + value);
        }
*/
    public  static  void Entryt(){
        Map<String,String> myMap=new HashMap<String,String>();
        myMap.put("N0lan","tryup");
        myMap.put("III","tryups");
        myMap.put("Cors","study");//add
        // 返回的Map.Entry对象的Set集合 Map.Entry包含了key和value对象
        Set<Map.Entry<String,String>> ts= myMap.entrySet();
        Iterator<Map.Entry<String,String>> all=ts.iterator();
        while (all.hasNext()){
            Map.Entry<String, String> allin = all.next();
            System.out.println("key="+allin.getKey()+"  value="+allin.getValue());
        }

    }

}

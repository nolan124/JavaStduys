import sun.invoke.empty.Empty;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SelfClass {
    public static  void main(String[] args){
        HashMap<Person,String> mymap=new HashMap<Person,String>();
        mymap.put(new Person("N0lan",99),"boy");
        mymap.put(new Person("zAD",99),"GIR");
        Set<Map.Entry<Person,String>> duixiang=mymap.entrySet();
        Iterator<Map.Entry<Person, String>> it = duixiang.iterator();
        while(it.hasNext()){
            Map.Entry<Person,String> next=it.next();
            Person key= next.getKey();
            String value = next.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
class Person{
    private String name;
    private int age;
    Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void Setname(String name){
        this.name=name;
    }
    @Override
    public int hashCode() {

        return this.name.hashCode() + age * 37;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {

        return "Person@name:" + this.name + " age:" + this.age;
    }


}

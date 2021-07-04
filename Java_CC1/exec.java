import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class exec {
   public static void main(String[] args) throws Exception{
/*       Class clas = Class.forName("java.lang.Runtime");
       Object obj = clas.getMethod("getRuntime").invoke(null,null);
       clas.getMethod("exec", String.class).invoke(obj,"calc");*/
       try{
           Class.forName("java.lang.Runtime").getMethod("exec", String.class).invoke(
                   Class.forName("java.lang.Runtime").getMethod("getRuntime").invoke(null,null),
                   new String [] { "calc" }
           );
       } catch(Exception e) {
           e.printStackTrace();
   }
}}

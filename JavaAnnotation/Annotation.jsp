import java.lang.annotation.*;
import java.lang.reflect.Field;

@Exploit()
public class Annotationcode {
 public @interface Father{
  public String css() default "father";
 }

 @Father(css="dada")
 int a;
 public static void main(String[] args){

/*  boolean hasAnnotation=Annotationcode.class.isAnnotationPresent(Exploit.class);//panduan shifou shiyong zhujie
   if(hasAnnotation){
   Exploit exploit=Annotationcode.class.getAnnotation(Exploit.class); //huo qu zhu jie duixiang
   System.out.println("id:"+exploit.msg());*/
  try {
   Field a =Annotationcode.class.getDeclaredField("a");
   a.setAccessible(true);
   Father fa=a.getAnnotation(Father.class);
   if(fa!=null){
    System.out.println(fa.css());
   }
  }
 catch (NoSuchFieldException e) {
   e.printStackTrace();
  }

 }
}
 @interface Father{
 public String css() default "father";
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
  @interface Exploit{
 public int id() default 520;

 public String msg() default "Hiss";
}
@Exploit
 class HelloExp{

}



@Father
 class Boy{

}

class girl extends Boy{

}
@interface Persons{
 Person[] value();
}

@Repeatable(Persons.class)
@interface Person {
 String role();

}
@Person(role="artist")
@Person(role="coder")
@Person(role="PM")
class Chaoren{
 String vule="";
}


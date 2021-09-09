import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {
    public static void main(String[] args) {
        Kcsec a = new Kcsec();
        a.setName("Nolan");
        a.setAge(18);
        a.object=new jacksonRce();
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        try {
            String json = mapper.writeValueAsString(a);
            //System.out.println("序列化前: " + a);
            //System.out.println("序列化后: " + json);
            unserialize();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static  void unserialize(){
        String json="{\"name\":\"Nolan\",\"age\":18";
        String json1="[]";
        ObjectMapper mapper=new ObjectMapper();
        mapper.enableDefaultTyping();
        try {
            System.out.println("unserialize: " + mapper.readValue(json1, Kcsec.class));
        }catch(IOException e){
                e.printStackTrace();
        }

    }
}
class jacksonRce{
    public String name="getshell";
}


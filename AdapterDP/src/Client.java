interface JsonParser{
    void parseJson(String json);
}

class XmlParser{
    public void parseXml(String xml){
        //code to parse xml
        System.out.println("XML parsed: " + xml);
    }
}

class XmlToJsonAdapter implements JsonParser{
    private XmlParser xmlParser;

    public XmlToJsonAdapter(XmlParser xmlParser){
        this.xmlParser=xmlParser;
    }

    public void parseJson(String json){
        String xml=convertJsonToXml(json);
        xmlParser.parseXml(xml);
    }

    private String convertJsonToXml(String json){
        //code to convert JSON to XML
        return "<root><name>John</name><age>30</age></root>";
    }
}
public class Client {
    public static void main(String[] args){
        XmlParser xmlParser=new XmlParser();
        JsonParser jsonParser=new XmlToJsonAdapter(xmlParser);
        jsonParser.parseJson("{\"name\": \"John\", \"age\": 30}");
    }
}

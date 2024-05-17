package adapter.example_code;

public class ClassLoggerAdapter extends XmlLogger implements JsonLogger{
    @Override
    public void logMessage(JsonData jsonData) {
        XmlData xmlData = new XmlData(jsonData.getMessage());
        super.log(xmlData);
    }
}

package adapter.example_code;

public class LoggerAdapter implements JsonLogger {
    private final XmlLogger xmlLogger;

    public LoggerAdapter(XmlLogger xmlLogger) {
        this.xmlLogger = xmlLogger;
    }

    @Override
    public void logMessage(JsonData jsonData) {
        XmlData xmlData = new XmlData(jsonData.getMessage());
        xmlLogger.log(xmlData);
    }
}
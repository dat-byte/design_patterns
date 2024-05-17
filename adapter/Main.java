package adapter;

import adapter.example_code.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Object Adapter");
        objectAdapter();

        System.out.println("\n");

        System.out.println("Class Adapter: ");
        classAdapter();
    }

    public static void classAdapter() {
        JsonData jsonData = new JsonData("hello class adapter!");
        ClassLoggerAdapter loggerAdapter = new ClassLoggerAdapter();

        System.out.println(jsonData);
        loggerAdapter.logMessage(jsonData);
    }

    public static void objectAdapter() {
        JsonData jsonData = new JsonData("hello there!");
        XmlLogger xmlLogger = new XmlLogger();

        LoggerAdapter loggerAdapter = new LoggerAdapter(xmlLogger);

        System.out.println(jsonData);
        loggerAdapter.logMessage(jsonData);
    }
}

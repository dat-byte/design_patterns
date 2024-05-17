package adapter.example_code;

public class XmlData {
    private final String message;

    public XmlData(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "<message>" + this.message + "</message>";
    }

    public String getMessage() {
        return this.message;
    }
}

package adapter.example_code;

public class JsonData {
    private final String message;

    public JsonData(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{message: " + this.message + "}";
    }

    public String getMessage() {
        return this.message;
    }
}

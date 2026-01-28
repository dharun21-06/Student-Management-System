package exception;

public class StudentDoesntExist extends RuntimeException {
    String message;

    public StudentDoesntExist() {
        super();
        message = null;
    }

    public StudentDoesntExist(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "StudentDoesntExist{" +
                "message='" + message + '\'' +
                '}';
    }

}

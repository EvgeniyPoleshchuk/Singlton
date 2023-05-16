import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Logger {
    private static Logger instance;

    private Logger() {
    }

    protected int num = 1;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        System.out.println("[" + time.format(formatter) + " " + num++ + "] " + msg);
    }
}

package logger;

public class Logger {

    private static final Logger instance = new Logger();

    private Logger() {

    }

    public static Logger getInstance() {
        return instance;
    }

    public void logInfo(String mensaje) {
        IO.println("INFO: " + mensaje);
    }

    public void logWarning(String mensaje) {
        IO.println("WARNING: " + mensaje);
    }

    public void logError(String mensaje) {
        IO.println("ERROR" + mensaje);
    }
}

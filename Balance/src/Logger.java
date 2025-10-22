import java.time.LocalDateTime;

interface Logger {
    void log(String msg);
}

// Простой логгер
class SimpleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("[" + LocalDateTime.now() + "] " + msg);
    }
}

// Умный логгер
class SmartLogger implements Logger {
    private int counter = 0;

    @Override
    public void log(String msg) {
        counter++;
        String logLevel = "INFO";

        if (msg.toLowerCase().contains("error")) {
            logLevel = "ERROR";
        }

        System.out.println(logLevel + "#" + counter + " [" + LocalDateTime.now() + "] " + msg);
    }
}
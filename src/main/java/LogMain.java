import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogMain {

    static Logger Logger = LogManager.getLogger();

    public static void main(String[] args) {
        Logger.info("info");
        Logger.error("first log");

        //Log Level -> All / Trace/  Debug / Info / Warn / Error/ / Fatal /  Off
        Logger.log(Level.ERROR, "second");

        // Structure - Appender / Layouts / Logger

    }
}
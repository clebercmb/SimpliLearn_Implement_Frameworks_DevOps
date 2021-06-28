import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DependencyInjectionDemo {
    Scanner scanner;
    private Logger logger; //
    


    public DependencyInjectionDemo(Logger logger) {
        this.scanner = new Scanner(System.in);
        this.logger = logger;

        logger.log(Level.WARNING, "This is a log message to show DI");
    }
}

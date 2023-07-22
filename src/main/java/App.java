import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        Cat bean4 = (Cat) applicationContext.getBean("cat");
        String formatMessage1 = String.format("Результат сравнения bean1 и bean2: %s",bean1.equals(bean2));
        String formatMessage2 = String.format("Результат сравнения bean3 и bean4: %s",bean3.equals(bean4));
        LOGGER.info(formatMessage1);
        LOGGER.info(formatMessage2);
    }
}
package lk.HostelManagementSystem.util;

import java.io.IOException;
import java.util.Properties;


    public class Utility {
        public Utility() {
        }

        public static Properties getProperties() {
            Properties properties = new Properties();

            try {
                properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));
            } catch (IOException var2) {
                var2.printStackTrace();
            }

            return properties;
        }
    }

}

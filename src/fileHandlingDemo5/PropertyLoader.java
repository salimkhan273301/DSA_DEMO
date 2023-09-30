package fileHandlingDemo5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
    private static Properties properties;

    public static void loadProperties(String propertiesFilePath) {
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(propertiesFilePath)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static int getIntProperty(String key) {
        String value = getProperty(key);
        return value != null ? Integer.parseInt(value) : 0; // Default value if property is not found
    }
}

package fileHandlingDemo4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
    private Properties properties;

    public PropertyLoader(String propertiesFilePath) {
        properties = loadProperties(propertiesFilePath);
    }

    private Properties loadProperties(String filePath) {
        Properties loadedProperties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            loadedProperties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loadedProperties;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public int getIntProperty(String key) {
        String value = getProperty(key);
        return value != null ? Integer.parseInt(value) : 0; // Default value if property is not found
    }
}

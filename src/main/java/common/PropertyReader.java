package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    private String propertiesPath = "src/main/resources/test.properties";
    private Properties properties = new Properties();

    private void loadPropertiesFile() {
        try (InputStream stream = new FileInputStream(propertiesPath)) {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PropertyReader() {
        loadPropertiesFile();
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public String getUsername() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }
    public String getLoginUrl() {
        return properties.getProperty("loginUrl");
    }
    public String getBaseApiUrlProperty() {
        return properties.getProperty("baseApiUrl");
    }
    public String getToken() {
        return properties.getProperty("token");
    }
    public String getApiKey() {
        return properties.getProperty("apiKey");
    }

}

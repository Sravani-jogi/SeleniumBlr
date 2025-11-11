package com.parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static Properties readProperty() {
        Properties prop = new Properties();
        String filePath = "src/test/resources/PropertieFiles/Profile.properties";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            prop.load(fis);
        } catch (FileNotFoundException e) {
            System.out.println("Property file not found at: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading property file: " + e.getMessage());
        }

        return prop;
    }
}
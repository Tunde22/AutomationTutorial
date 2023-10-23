package PropertyUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

public class PropertyUtility {

    public Properties properties;

    public PropertyUtility(String testName) {
        loadFile(testName);
    }

    public void loadFile(String testName){
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream("src/test/resources/InputData/" + testName + "Data.properties");
            properties.load(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }

    public HashMap<String, String> getAllData(){
        HashMap<String,String> testData = new HashMap<>();
        for(Object key: properties.keySet()){
            testData.put(key.toString(),properties.getProperty(key.toString()));
        }
        return testData;
    }


}
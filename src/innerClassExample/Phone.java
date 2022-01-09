package innerClassExample;

import properteisReading.ReadPropertiesFile;

import java.io.IOException;
import java.util.Properties;

public class Phone {

    /**
     * Three types of Inner Class
     *
     * 1) Member Class
     * 2) static class
     * 3) Anonymous class
     */

    public void show() {
//        System.out.println("Call");
        new SmartPhone().android();
    }


  public static class SmartPhone{


        public void android() {

            ReadPropertiesFile readPropertiesFile = new ReadPropertiesFile();
            try {
                Properties properties = readPropertiesFile.readProperties("/Users/jewal/Desktop/learning/qa2Class9/src/env.properties");
                System.out.println(properties.getProperty("url"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}

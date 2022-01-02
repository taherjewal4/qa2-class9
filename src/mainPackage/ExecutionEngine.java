package mainPackage;

import innerClassExample.Phone;

public class ExecutionEngine {


    public static void main(String[] args) {

//        String propFilePath = "/Users/jewal/Desktop/learning/qa2Class9/src/env.properties";
//
//        ReadPropertiesFile propertiesFile = new ReadPropertiesFile();
//
//        try {
//            Properties properties = propertiesFile.readProperties(propFilePath);
//
//            System.out.println(properties.getProperty("url"));
//            System.out.println(properties.getProperty("user"));
//            System.out.println(properties.getProperty("pass"));
//
//        }catch (Exception e){
//
//        }


        Phone.SmartPhone ph = new Phone.SmartPhone();

        ph.android();

        new Phone() {

            public void testMobile() {
                System.out.println("Im from test mobile");
            }
        }.testMobile();

    }
}

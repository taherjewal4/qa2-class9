package properteisReading;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public Properties readProperties(String filePath)throws IOException {
        FileReader fileReader = new FileReader(new File(filePath));
        Properties properties = new Properties();
        properties.load(fileReader);
        fileReader.close();
        return properties;
    }
}

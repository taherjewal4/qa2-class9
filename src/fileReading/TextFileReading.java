package fileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReading {

    public static void main(String[] args)  {
        String filePath = "/Users/jewal/Desktop/learning/qa2Class9/src/demo.txt";

        TextFileReading readFile = new TextFileReading();
        try {
            readFile.readFile(filePath);

        }catch (Exception e){

        }


    }


    public void readFile(String filePath) throws IOException{
        File fl = new File(filePath);

        FileReader fileReader = new FileReader(fl);

        BufferedReader br = new BufferedReader(fileReader);

        String str;

        while ((str = br.readLine()) != null) {

            System.out.println(str);
        }
    }


}

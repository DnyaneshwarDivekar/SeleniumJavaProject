package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class TestDataReader {
    public static String getTestData(String key) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:\\GitHubProjects\\JavaProject\\resources\\testdata.json"));
            JSONObject jsonObject = (JSONObject) obj;
            return (String) jsonObject.get(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import io.json.simple.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestGetReader {

    @BeforeClass
    public static void setup() {
        Serializer.setEncoding("UTF-8");
    }

    @Test
    public void testGetReader() throws DBAppException {
        DBApp dbApp = new DBApp();
        CSVReader reader = null;
        assertNotNull(reader);
        dbApp.setReader(reader);
        assertNotNull(reader);
        System.out.println("Reader: " + reader);
        reader.close();
    }

}
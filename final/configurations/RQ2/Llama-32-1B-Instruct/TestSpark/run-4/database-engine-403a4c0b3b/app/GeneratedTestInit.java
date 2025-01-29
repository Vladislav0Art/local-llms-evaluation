package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import io.json.simple.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestInit {

    @BeforeClass
    public static void setup() {
        Serializer.setEncoding("UTF-8");
    }

    @Test
    public void testInit() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.init());
    }

    @Before
    public static void before() {
    }

    @After
    public static void after() {
    }

}
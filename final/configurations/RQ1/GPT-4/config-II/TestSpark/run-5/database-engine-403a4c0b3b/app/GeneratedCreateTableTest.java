package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() {
        CsvWriter mockWriter = Mockito.mock(CsvWriter.class);
        DBApp app = new DBApp();
        app.setWriter(mockWriter);

        try {
            Hashtable<String, String> htblColNameType = new Hashtable<>();
            htblColNameType.put("id", "int");

            Hashtable<String, String> htblColNameMin = new Hashtable<>();
            htblColNameMin.put("id", "1");

            Hashtable<String, String> htblColNameMax = new Hashtable<>();
            htblColNameMax.put("id", "1000");

            app.createTable("users", "id", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            fail();
        }
    }

}
package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.*;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() {
        DBApp app = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            htblColNameValue.put("id", 1);

            app.insertIntoTable("users", htblColNameValue);
        } catch (DBAppException e) {
            fail();
        }
    }

}
package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.*;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() {
        DBApp app = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            htblColNameValue.put("id", 2);

            app.updateTable("users", "1", htblColNameValue);
        } catch (DBAppException e) {
            fail();
        }
    }

}
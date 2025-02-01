package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() {
        DBApp app = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            htblColNameValue.put("id", 1);

            app.deleteFromTable("users", htblColNameValue);
        } catch (DBAppException e) {
            fail();
        }
    }

}
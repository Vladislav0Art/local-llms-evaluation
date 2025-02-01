package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import storage.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.deleteFromTable("table", htblColNameValue);
        } catch (DBAppException e) {
            // expected exception here, do nothing
        }
    }

}
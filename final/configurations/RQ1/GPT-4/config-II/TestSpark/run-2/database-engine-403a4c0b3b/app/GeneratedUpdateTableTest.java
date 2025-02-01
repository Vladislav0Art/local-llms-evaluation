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

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.updateTable("table", "value", htblColNameValue);
        } catch (DBAppException e) {
            // expected exception here, do nothing
        }
    }

}
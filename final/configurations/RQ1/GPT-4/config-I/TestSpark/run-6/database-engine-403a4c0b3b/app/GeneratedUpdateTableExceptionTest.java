package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.text.ParseException;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedUpdateTableExceptionTest {

    @Test
    public void updateTableExceptionTest() {
        DBApp testApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();
        htblColNameValue.put("testKey", "testValue");
        assertThrows(DBAppException.class, () -> {
            testApp.updateTable("nonExistingTable", "testKey", htblColNameValue);
        });
    }

}
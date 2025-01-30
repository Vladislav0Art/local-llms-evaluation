package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.text.ParseException;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedInsertIntoTableExceptionTest {

    @Test
    public void insertIntoTableExceptionTest() {
        DBApp testApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();
        assertThrows(DBAppException.class, () -> {
            testApp.insertIntoTable("nonExistingTable", htblColNameValue);
        });
    }

}
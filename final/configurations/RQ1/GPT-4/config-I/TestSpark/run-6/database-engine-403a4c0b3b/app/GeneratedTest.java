package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.text.ParseException;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp testApp = new DBApp();
        testApp.init();
        assertEquals(0, testApp.getMyTables().size());
    }

    @Test
    public void createTableExistingNameTest() throws DBAppException {
        DBApp testApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<String, String>();
        Hashtable<String, String> htblColNameMin = new Hashtable<String, String>();
        Hashtable<String, String> htblColNameMax = new Hashtable<String, String>();
        testApp.createTable("testTable", "testKey", htblColNameType, htblColNameMin, htblColNameMax);
        assertThrows(DBAppException.class, () -> {
            testApp.createTable("testTable", "testKey", htblColNameType, htblColNameMin, htblColNameMax);
        });
    }

    @Test
    public void createTableNullExceptionsTest() {
        DBApp testApp = new DBApp();
        assertThrows(DBAppException.class, () -> {
            testApp.createTable(null, null, null, null, null);
        });
    }

    @Test
    public void insertIntoTableExceptionTest() {
        DBApp testApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();
        assertThrows(DBAppException.class, () -> {
            testApp.insertIntoTable("nonExistingTable", htblColNameValue);
        });
    }

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
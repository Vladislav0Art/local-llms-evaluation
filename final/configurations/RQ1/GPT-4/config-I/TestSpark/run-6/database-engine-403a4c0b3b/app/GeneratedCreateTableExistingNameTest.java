package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.text.ParseException;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedCreateTableExistingNameTest {

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

}
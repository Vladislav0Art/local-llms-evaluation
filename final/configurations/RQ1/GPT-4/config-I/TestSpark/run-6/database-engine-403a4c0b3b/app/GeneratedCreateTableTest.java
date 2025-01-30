package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import storage.Table;
import util.filecontroller.Serializer;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException, IOException, ParseException {
        DBApp testApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<String, String>();
        Hashtable<String, String> htblColNameMin = new Hashtable<String, String>();
        Hashtable<String, String> htblColNameMax = new Hashtable<String, String>();
        testApp.createTable("testTable", "testKey", htblColNameType, htblColNameMin, htblColNameMax);

        assertEquals(1, testApp.getMyTables().size());
        assertEquals(Table.class, Serializer.deserializeTable("testTable").getClass());
    }

}
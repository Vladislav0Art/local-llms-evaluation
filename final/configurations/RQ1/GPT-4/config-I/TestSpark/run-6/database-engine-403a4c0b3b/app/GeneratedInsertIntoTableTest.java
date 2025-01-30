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

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException, IOException, ParseException {
        DBApp testApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();
        testApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        testApp.insertIntoTable("testTable", htblColNameValue);

        assertEquals(1, Serializer.deserializeTable("testTable").getTableTuples().size());
    }

}
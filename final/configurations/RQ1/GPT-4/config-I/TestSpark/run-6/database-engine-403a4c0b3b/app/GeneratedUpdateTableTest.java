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

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException, IOException, ParseException {
        DBApp testApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();
        htblColNameValue.put("testKey", "testValue");
        testApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        testApp.updateTable("testTable", "testKey", htblColNameValue);

        assertEquals("testValue", Serializer.deserializeTable("testTable")
                .getTableTuples().get(0).getRecord().get("testKey"));
    }

}
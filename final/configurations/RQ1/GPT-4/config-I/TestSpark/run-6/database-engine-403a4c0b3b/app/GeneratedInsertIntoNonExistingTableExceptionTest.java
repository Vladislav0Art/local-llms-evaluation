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

public class GeneratedInsertIntoNonExistingTableExceptionTest {

    @Test
    public void insertIntoNonExistingTableExceptionTest() {
        DBApp testApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();
        assertThrows(DBAppException.class, () -> {
            testApp.insertIntoTable("nonExistingTable", htblColNameValue);
        });
    }

}
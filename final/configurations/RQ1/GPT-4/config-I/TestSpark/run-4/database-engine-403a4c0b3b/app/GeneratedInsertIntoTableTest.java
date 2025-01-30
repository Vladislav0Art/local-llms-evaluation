package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() {
        DBApp app = new DBApp();
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("col1", "val1");

        try {
            app.insertIntoTable("tableName", hashtable);
        } catch (DBAppException e) {
            Assert.fail("Test failed due to DBAppException");
        }
    }

}
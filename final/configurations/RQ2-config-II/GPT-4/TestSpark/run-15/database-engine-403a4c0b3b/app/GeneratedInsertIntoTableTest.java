package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.io.IOException;
import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() {
        DBApp dbApp = Mockito.spy(DBApp.class);
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("test1", "value1");
        try {
            dbApp.insertIntoTable("Test", colNameValue);
        } catch (DBAppException e) {
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }
        Mockito.verify(dbApp, Mockito.times(1)).insertIntoTable("Test", colNameValue);
    }

}
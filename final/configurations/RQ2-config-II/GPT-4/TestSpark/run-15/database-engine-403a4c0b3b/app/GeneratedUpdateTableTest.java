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

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() {
        DBApp dbApp = Mockito.spy(DBApp.class);
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("test1", "value1");
        try {
            dbApp.updateTable("Test", "Key", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }
        Mockito.verify(dbApp, Mockito.times(1)).updateTable("Test", "Key", htblColNameValue);
    }

}
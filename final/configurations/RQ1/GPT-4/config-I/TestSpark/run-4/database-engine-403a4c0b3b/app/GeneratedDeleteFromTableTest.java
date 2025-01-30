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

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() {
        DBApp app = Mockito.spy(new DBApp());
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("col1", "val1");
        try {
            app.deleteFromTable("tableName", hashtable);
        } catch (DBAppException e) {
            Assert.fail("Test failed due to DBAppException");
        }
    }

}
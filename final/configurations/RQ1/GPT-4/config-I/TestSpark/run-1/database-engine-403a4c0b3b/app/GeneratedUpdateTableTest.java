package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;
import util.search.*;

import java.util.Hashtable;
import java.util.Iterator;
import java.io.IOException;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        try {
            dbApp.updateTable("MyTable", "1", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail("Should not have thrown any exception");
        }
    }

}
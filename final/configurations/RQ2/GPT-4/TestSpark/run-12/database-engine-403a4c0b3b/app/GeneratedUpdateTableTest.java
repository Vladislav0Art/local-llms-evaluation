package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.updateTable("table", "keyValue", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail();
        }
    }

}
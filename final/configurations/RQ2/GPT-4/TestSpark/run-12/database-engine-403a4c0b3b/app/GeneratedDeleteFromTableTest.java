package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.deleteFromTable("table", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail();
        }
    }

}
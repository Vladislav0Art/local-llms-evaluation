package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        try {
            dbApp.createTable("table", "key", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            Assert.fail();
        }
    }

}
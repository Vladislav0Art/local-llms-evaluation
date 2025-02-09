package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import util.sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        HashSet<String> tables = dbApp.getMyTables();
        Assert.assertTrue(tables.contains("testTable"));
    }

}
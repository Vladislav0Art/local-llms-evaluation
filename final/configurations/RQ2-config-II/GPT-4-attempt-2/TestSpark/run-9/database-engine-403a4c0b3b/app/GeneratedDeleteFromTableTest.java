package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import util.sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        dbApp.deleteFromTable("testTable", new Hashtable<>());
        Assert.assertTrue(true);
    }

}
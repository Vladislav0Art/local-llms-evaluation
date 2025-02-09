package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import util.sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "testKey", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        Assert.assertNotNull(dbApp.selectFromTable(new SQLTerm[]{}, new String[]{}));
    }

}
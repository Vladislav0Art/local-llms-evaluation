package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;

import sql.SQLTerm;

public class GeneratedInitTest {

    @Test
    public void initTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.init();
        HashSet<String> tables = dbApp.getMyTables();

        Assert.assertNotNull(tables);
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import util.sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        Assert.assertTrue(true);
    }

}
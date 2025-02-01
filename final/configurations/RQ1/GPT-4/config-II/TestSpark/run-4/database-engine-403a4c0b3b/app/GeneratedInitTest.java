package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        HashSet<String> tables = dbApp.getMyTables();
        Assert.assertNotNull(tables);
    }

}
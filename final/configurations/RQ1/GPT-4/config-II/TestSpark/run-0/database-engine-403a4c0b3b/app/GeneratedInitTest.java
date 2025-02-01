package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;
import java.io.IOException;
import java.text.ParseException;

import org.mockito.Mockito;
import app.DBApp;
import exceptions.DBAppException;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp);
        dbApp.init();
        Assert.assertTrue(dbApp.getMyTables().isEmpty());
    }

}
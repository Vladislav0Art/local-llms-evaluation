package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();

        Assert.assertNotNull(dbApp.getMyTables());
        Assert.assertNotNull(dbApp.getReader());
        Assert.assertNotNull(dbApp.getWriter());
    }

}
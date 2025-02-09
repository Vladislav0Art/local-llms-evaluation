package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        Object result = dbApp.getWriter();
        Assert.assertNotNull(result);
    }

}
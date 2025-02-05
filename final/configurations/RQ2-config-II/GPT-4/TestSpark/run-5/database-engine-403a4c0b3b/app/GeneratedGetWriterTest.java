package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp instance = new DBApp();
        Assert.assertNotNull(instance.getWriter());
    }

}
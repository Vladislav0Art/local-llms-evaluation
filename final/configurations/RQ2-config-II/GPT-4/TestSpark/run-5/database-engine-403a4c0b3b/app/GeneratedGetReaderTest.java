package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp instance = new DBApp();
        Assert.assertNotNull(instance.getReader());
    }

}
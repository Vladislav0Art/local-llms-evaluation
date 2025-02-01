package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getWriter());
    }

}
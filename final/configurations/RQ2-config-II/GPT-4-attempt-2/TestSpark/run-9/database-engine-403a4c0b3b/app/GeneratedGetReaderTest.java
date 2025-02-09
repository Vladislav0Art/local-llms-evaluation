package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import util.sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getReader());
    }

}
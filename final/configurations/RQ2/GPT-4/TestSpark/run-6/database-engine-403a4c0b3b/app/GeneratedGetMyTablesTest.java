package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getMyTables());
    }

}
package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getMyTables());
        Assert.assertTrue(dbApp.getMyTables() instanceof HashSet);
    }

}
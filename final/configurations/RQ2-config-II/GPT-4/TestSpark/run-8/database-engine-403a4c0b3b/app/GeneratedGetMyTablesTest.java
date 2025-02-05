package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        // create a new instance of DBApp class
        DBApp app = new DBApp();
        HashSet<String> result = app.getMyTables();

        // test if the result type is of HashSet<String> class
        Assert.assertTrue(result instanceof HashSet);
    }

}
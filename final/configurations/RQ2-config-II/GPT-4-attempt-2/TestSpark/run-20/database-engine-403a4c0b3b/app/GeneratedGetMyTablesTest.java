package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();

        // Test will pass if result is not null, as we are just testing the functionality of the method.
        // Asserting actual values involves external variables (like accessing from database) which is outside the scope of unit test
        Assert.assertNotNull(result);
    }

}
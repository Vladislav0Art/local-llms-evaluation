package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertNotNull(result);
    }

}
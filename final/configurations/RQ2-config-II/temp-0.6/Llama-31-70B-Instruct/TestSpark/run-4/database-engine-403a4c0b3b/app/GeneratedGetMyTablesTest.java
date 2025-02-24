package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");
        assertEquals(expected, dbApp.getMyTables());
    }

}
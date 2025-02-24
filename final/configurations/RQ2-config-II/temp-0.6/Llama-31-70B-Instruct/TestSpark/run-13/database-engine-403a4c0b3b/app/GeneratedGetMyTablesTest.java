package app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> expected = new HashSet<>();
        expected.add("table1");
        expected.add("table2");
        HashSet<String> actual = dbApp.getMyTables();
        assertEquals(expected, actual);
    }

}
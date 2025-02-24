package app;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> expectedResult = new HashSet<>();
        expectedResult.add("table1");
        assertEquals(expectedResult, dbApp.getMyTables());
    }

}
package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import app.DBApp;
import app.IDatabase;
import app.Table;
import app.sql.SQLTerm;
import app.util.search.Selector;
import app.util.validation.Validator;

public class GeneratedTestGetMyTables {

    private DBApp dbApp;

    @Before
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> expectedTables = new HashSet<>();
        expectedTables.add("table1");
        expectedTables.add("table2");

        dbApp.myTables = expectedTables;
        HashSet<String> actualTables = dbApp.getMyTables();

        assertEquals(expectedTables, actualTables);
    }

}
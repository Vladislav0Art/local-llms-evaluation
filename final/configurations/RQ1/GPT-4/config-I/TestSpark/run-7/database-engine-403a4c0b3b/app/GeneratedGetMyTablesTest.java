package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> expectedTables = new HashSet<>(Arrays.asList("table1", "table2"));
        dbApp.getMyTables().addAll(expectedTables);
        HashSet<String> actualTables = dbApp.getMyTables();
        Assert.assertEquals(expectedTables, actualTables);
    }

}
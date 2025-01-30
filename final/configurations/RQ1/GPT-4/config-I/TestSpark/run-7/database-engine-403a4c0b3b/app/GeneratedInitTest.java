package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> expectedTables = new HashSet<>(Arrays.asList("table1", "table2"));
        when(dbApp.getReader().readAllTables()).thenReturn(expectedTables);
        dbApp.init();
        HashSet<String> actualTables = dbApp.getMyTables();
        Assert.assertEquals(expectedTables, actualTables);
    }

}
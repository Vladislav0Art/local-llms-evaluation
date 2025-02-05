package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = mock(DBApp.class);
        when(dbApp.getMyTables()).thenReturn(new HashSet<String>());
        HashSet<String> result = dbApp.getMyTables();
        Assert.assertNotNull(result);
    }

}
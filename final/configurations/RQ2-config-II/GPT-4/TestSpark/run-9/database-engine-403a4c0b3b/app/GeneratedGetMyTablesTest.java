package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedGetMyTablesTest {

    @Test
    public void getMyTablesTest() {
        // Given
        DBApp dbApp = new DBApp();

        // When
        HashSet<String> result = dbApp.getMyTables();

        // Then
        Assert.assertNotNull(result);
    }

}
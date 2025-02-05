package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        // Given
        DBApp dbApp = new DBApp();

        // When
        CsvReader csvReader = dbApp.getReader();

        // Then
        Assert.assertNotNull(csvReader);
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        // Given
        DBApp dbApp = new DBApp();

        // When
        CsvWriter csvWriter = dbApp.getWriter();

        // Then
        Assert.assertNotNull(csvWriter);
    }

}
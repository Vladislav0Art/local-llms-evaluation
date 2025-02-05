package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        // Given
        DBApp dbApp = new DBApp();

        // When
        HashSet<String> result = dbApp.getMyTables();

        // Then
        Assert.assertNotNull(result);
    }

    @Test
    public void getReaderTest() {
        // Given
        DBApp dbApp = new DBApp();

        // When
        CsvReader csvReader = dbApp.getReader();

        // Then
        Assert.assertNotNull(csvReader);
    }

    @Test
    public void getWriterTest() {
        // Given
        DBApp dbApp = new DBApp();

        // When
        CsvWriter csvWriter = dbApp.getWriter();

        // Then
        Assert.assertNotNull(csvWriter);
    }

    @Test
    public void createTableTest() throws DBAppException {
        // Given
        DBApp dbApp = new DBApp();

        // When
        dbApp.createTable("test_table", "test_key",
                new Hashtable<>(), new Hashtable<>(),
                new Hashtable<>());
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        // Given
        DBApp dbApp = new DBApp();

        // When
        dbApp.insertIntoTable("test_table", new Hashtable<>());
    }

    @Test
    public void updateTableTest() throws DBAppException {
        // Given
        DBApp dbApp = new DBApp();

        // When
        dbApp.updateTable("test_table", "test_key", new Hashtable<>());
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        // Given
        DBApp dbApp = new DBApp();

        // When
        dbApp.deleteFromTable("test_table", new Hashtable<>());
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        // Given
        DBApp dbApp = new DBApp();

        // When
        dbApp.selectFromTable(new SQLTerm[]{}, new String[]{});
    }

}
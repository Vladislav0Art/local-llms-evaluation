package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void getMyTablesTest_EmptyHashSet() {
        HashSet<String> result = dbApp.getMyTables();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void getReaderTest_NotNull() {
        assertNotNull(dbApp.getReader());
    }

    @Test
    public void getWriterTest_NotNull() {
        assertNotNull(dbApp.getWriter());
    }

    @Test
    public void initTest_NoException() {
        dbApp.init();
        verifyNoMoreInteractions(dbApp);
    }

    @Test
    public void createTableTest_NullTableName() throws DBAppException {
        dbApp.createTable(null, "column1", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

    @Test
    public void createTableTest_NullClusteringKeyColumn() throws DBAppException {
        dbApp.createTable("table1", null, new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

    @Test
    public void createTableTest_ValidInput() throws DBAppException {
        dbApp.createTable("table1", "column1", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        verifyNoMoreInteractions(dbApp);
    }

    @Test
    public void insertIntoTableTest_NullTableName() throws DBAppException {
        dbApp.insertIntoTable(null, new Hashtable<>());
    }

    @Test
    public void insertIntoTableTest_NullHashtable() throws DBAppException {
        dbApp.insertIntoTable("table1", null);
    }

    @Test
    public void insertIntoTableTest_ValidInput() throws DBAppException {
        dbApp.insertIntoTable("table1", new Hashtable<>());
        verifyNoMoreInteractions(dbApp);
    }

}
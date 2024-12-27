package app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Map;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void getMyTables_EmptySet_ReturnsEmptySet() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

    @Test
    public void getReader_MocksCsvReaderReturnNull_ThrowsNullPointerException() {
        when(dbApp.getCsvReader()).thenReturn(null);
        try {
            dbApp.getReader();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void getWriter_MocksCsvWriterReturnNull_ThrowsNullPointerException() {
        when(dbApp.getCsvWriter()).thenReturn(null);
        try {
            dbApp.getWriter();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void init_MocksInitMethodDoesNothing_DoesNotThrowException() {
        Mockito.when(dbApp.init()).thenAnswer(e -> {
        });
        dbApp.init();
    }

    @Test
    public void createTable_MocksCreateTableMethodDoesNothing_ReturnsNoException() throws DBAppException {
        when(dbApp.createTable("tableName", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax)).thenAnswer(e -> {
        });
        try {
            dbApp.createTable("tableName", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            // expected
        }
    }

    @Test
    public void insertIntoTable_MocksInsertIntoTableMethodDoesNothing_ReturnsNoException() throws DBAppException {
        when(dbApp.insertIntoTable("tableName", htblColNameValue)).thenAnswer(e -> {
        });
        try {
            dbApp.insertIntoTable("tableName", htblColNameValue);
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            // expected
        }
    }

    @Test
    public void updateTable_MocksUpdateTableMethodDoesNothing_ReturnsNoException() throws DBAppException {
        when(dbApp.updateTable("tableName", htblColNameValue)).thenAnswer(e -> {
        });
        try {
            dbApp.updateTable("tableName", htblColNameValue);
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            // expected
        }
    }

    @Test
    public void deleteTable_MocksDeleteTableMethodDoesNothing_ReturnsNoException() throws DBAppException {
        when(dbApp.deleteTable("tableName")).thenAnswer(e -> {
        });
        try {
            dbApp.deleteTable("tableName");
            fail("Expected DBAppException");
        } catch (DBAppException e) {
            // expected
        }
    }

    @Test
    public void selectFromTable_MocksSelectFromTableMethodDoesNothing_ReturnsNoIterator() throws DBAppException, Iterator.EmptyIteratorException {
        when(dbApp.selectFromTable(SQLTerm[].class, strarrOperators)).thenAnswer(e -> {
        });
        try {
            dbApp.selectFromTable(new SQLTerm[]{}, new String[]{"op"});
            fail("Expected Iterator.EmptyIteratorException");
        } catch (Iterator.EmptyIteratorException e) {
            // expected
        }
    }

    @Test
    public void selectFromTable_MocksSelectFromTableMethodReturnsEmptyList() throws DBAppException, Iterator.EmptyIteratorException {
        when(dbApp.selectFromTable(SQLTerm[].class, strarrOperators)).thenAnswer(e -> new ArrayList<>());
        try {
            dbApp.selectFromTable(new SQLTerm[]{}, new String[]{"op"});
            fail("Expected EmptyIteratorException");
        } catch (Iterator.EmptyIteratorException e) {
            // expected
        }
    }

    @Test
    public void getMyTables_MocksGetMyTablesMethodReturnsEmptySet() {
        when(dbApp.getMyTables()).thenReturn(new HashSet<>());
        assertEquals(0, dbApp.getMyTables().size());
    }

}
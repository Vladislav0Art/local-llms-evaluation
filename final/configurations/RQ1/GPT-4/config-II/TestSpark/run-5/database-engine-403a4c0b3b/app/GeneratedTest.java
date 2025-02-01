package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import exceptions.DBAppException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void initTest() {
        CsvReader mockReader = Mockito.mock(CsvReader.class);
        when(mockReader.readAllTables()).thenReturn(new HashSet<>());

        DBApp app = new DBApp();
        app.setReader(mockReader);
        app.init();

        verify(mockReader, times(1)).readAllTables();
        assertTrue(app.getMyTables().isEmpty());
    }

    @Test
    public void createTableTest() {
        CsvWriter mockWriter = Mockito.mock(CsvWriter.class);
        DBApp app = new DBApp();
        app.setWriter(mockWriter);

        try {
            Hashtable<String, String> htblColNameType = new Hashtable<>();
            htblColNameType.put("id", "int");

            Hashtable<String, String> htblColNameMin = new Hashtable<>();
            htblColNameMin.put("id", "1");

            Hashtable<String, String> htblColNameMax = new Hashtable<>();
            htblColNameMax.put("id", "1000");

            app.createTable("users", "id", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            fail();
        }
    }

    @Test
    public void createTableFailTest_DBAppException() throws DBAppException {
        DBApp app = new DBApp();
        app.createTable(null, null, null, null, null);
    }

    @Test
    public void insertIntoTableTest() {
        DBApp app = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            htblColNameValue.put("id", 1);

            app.insertIntoTable("users", htblColNameValue);
        } catch (DBAppException e) {
            fail();
        }
    }

    @Test
    public void insertIntoTableFailTest_DBAppException() throws DBAppException {
        DBApp app = new DBApp();
        app.insertIntoTable(null, null);
    }

    @Test
    public void updateTableTest() {
        DBApp app = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            htblColNameValue.put("id", 2);

            app.updateTable("users", "1", htblColNameValue);
        } catch (DBAppException e) {
            fail();
        }
    }

    @Test
    public void updateTableFailTest_DBAppException() throws DBAppException {
        DBApp app = new DBApp();
        app.updateTable(null, null, null);
    }

    @Test
    public void deleteFromTableTest() {
        DBApp app = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            htblColNameValue.put("id", 1);

            app.deleteFromTable("users", htblColNameValue);
        } catch (DBAppException e) {
            fail();
        }
    }

    @Test
    public void deleteFromTableFailTest_DBAppException() throws DBAppException {
        DBApp app = new DBApp();
        app.deleteFromTable(null, null);
    }

    @Test
    public void selectFromTableTest() {
        DBApp app = new DBApp();
        try {
            app.selectFromTable(null, null);
        } catch (DBAppException e) {
            fail();
        }
    }

    @Test
    public void selectFromTableFailTest_DBAppException() throws DBAppException {
        DBApp app = new DBApp();
        app.selectFromTable(new SQLTerm[0], new String[0]);
    }

}
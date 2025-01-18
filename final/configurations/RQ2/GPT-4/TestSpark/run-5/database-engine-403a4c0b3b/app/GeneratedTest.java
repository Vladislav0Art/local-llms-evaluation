package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getReader());
    }

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getWriter());
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void createTableTest() throws DBAppException {
        Hashtable<String, String> tableDetails = new Hashtable<>();
        tableDetails.put("col1", "val1");
        DBApp dbApp = new DBApp();
        dbApp.createTable("tableTest", "keyTest", tableDetails, tableDetails, tableDetails);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        Hashtable<String, Object> tableValues = new Hashtable<>();
        tableValues.put("col1", "val1");
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("tableTest", tableValues);
    }

    @Test
    public void insertIntoTableExceptionTest() throws DBAppException {
        DBApp dbApp = spy(DBApp.class);
        doThrow(new DBAppException("Test Exception"))
                .when(dbApp).insertIntoTable(anyString(), any(Hashtable.class));
        dbApp.insertIntoTable("tableTest", new Hashtable<>());
    }

    @Test
    public void updateTableTest() throws DBAppException {
        Hashtable<String, Object> tableValues = new Hashtable<>();
        tableValues.put("col1", "val1");
        DBApp dbApp = new DBApp();
        dbApp.updateTable("tableTest", "keyTest", tableValues);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        Hashtable<String, Object> tableValues = new Hashtable<>();
        tableValues.put("col1", "val1");
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("tableTest", tableValues);
    }

    @Test
    public void deleteFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = spy(DBApp.class);
        doThrow(new DBAppException("Test Exception"))
                .when(dbApp).deleteFromTable(anyString(), any(Hashtable.class));
        dbApp.deleteFromTable("tableTest", new Hashtable<>());
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.selectFromTable(new SQLTerm[0], new String[0]));
    }

}
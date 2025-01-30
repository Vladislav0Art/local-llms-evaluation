package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import storage.Table;
import util.filecontroller.Serializer;

import java.io.IOException;
import java.util.Hashtable;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void createTableInvalidTableTest() throws DBAppException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("name", "String");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("name", "0");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("name", "10");
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "name", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableInvalidTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "value");
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("testTable", htblColNameValue);
    }

    @Test
    public void updateTableInvalidTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "newValue");
        DBApp dbApp = new DBApp();
        dbApp.updateTable("testTable", "value", htblColNameValue);
    }

    @Test
    public void deleteFromTableInvalidTableTest() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "value");
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("testTable", htblColNameValue);
    }

    @Test
    public void createTableSerializeTableIOExceptionTest() throws DBAppException, IOException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("name", "String");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("name", "0");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("name", "10");
        Serializer serializer = mock(Serializer.class);
        doThrow(new IOException()).when(serializer).serializeTable(any(Table.class));
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "name", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void createTableCreateTableFilesIOExceptionTest() throws DBAppException, IOException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("name", "String");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("name", "0");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("name", "10");
        Table myTable = mock(Table.class);
        doThrow(new IOException()).when(myTable).createTableFiles();
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "name", htblColNameType, htblColNameMin, htblColNameMax);
    }

}
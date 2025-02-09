package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import sql.SQLTerm;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp app = new DBApp();
        app.init();
        assertNotNull("init method failed", app.getMyTables());
    }

    @Test
    public void createTableThrowsExceptionTest() throws DBAppException {
        DBApp app = new DBApp();
        app.createTable(null, null, null, null, null);
    }

    @Test
    public void insertIntoTableThrowsExceptionTest() throws DBAppException {
        DBApp app = new DBApp();
        app.insertIntoTable(null, null);
    }

    @Test
    public void updateTableThrowsExceptionTest() throws DBAppException {
        DBApp app = new DBApp();
        app.updateTable(null, null, null);
    }

    @Test
    public void deleteFromTableThrowsExceptionTest() throws DBAppException {
        DBApp app = new DBApp();
        app.deleteFromTable(null, null);
    }

    @Test
    public void selectFromTableThrowsExceptionTest() throws DBAppException {
        DBApp app = new DBApp();
        app.selectFromTable(null, null);
    }

    @Test
    public void getMyTablesTest() {
        DBApp app = new DBApp();
        assertNotNull("getMyTables method failed", app.getMyTables());
    }

    @Test
    public void getReaderTest() {
        DBApp app = new DBApp();
        assertNotNull("getReader method failed", app.getReader());
    }

    @Test
    public void getWriterTest() {
        DBApp app = new DBApp();
        assertNotNull("getWriter method failed", app.getWriter());
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp app = Mockito.spy(DBApp.class);
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        app.createTable("testTable", "keyCol", htblColNameType, htblColNameMin, htblColNameMax);
        Mockito.verify(app).createTable("testTable", "keyCol", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp app = Mockito.spy(DBApp.class);
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.insertIntoTable("testTable", htblColNameValue);
        Mockito.verify(app).insertIntoTable("testTable", htblColNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp app = Mockito.spy(DBApp.class);
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.updateTable("testTable", "keyVal", htblColNameValue);
        Mockito.verify(app).updateTable("testTable", "keyVal", htblColNameValue);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp app = Mockito.spy(DBApp.class);
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.deleteFromTable("testTable", htblColNameValue);
        Mockito.verify(app).deleteFromTable("testTable", htblColNameValue);
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp app = Mockito.spy(DBApp.class);
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        Iterator it = app.selectFromTable(arrSQLTerms, strarrOperators);
        assertNotNull("selectFromTable method failed", it);
    }

}
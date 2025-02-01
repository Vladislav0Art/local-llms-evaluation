package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.*;

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
        assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void createTableInvalidParamsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<String, String>();
        Hashtable<String, String> htblColNameMin = new Hashtable<String, String>();
        Hashtable<String, String> htblColNameMax = new Hashtable<String, String>();
        dbApp.createTable("", "", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableInvalidParamsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();
        dbApp.insertIntoTable("", htblColNameValue);
    }

    @Test
    public void updateTableInvalidParamsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();
        dbApp.updateTable("", "", htblColNameValue);
    }

    @Test
    public void deleteFromTableInvalidParamsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();
        dbApp.deleteFromTable("", htblColNameValue);
    }

    @Test
    public void selectFromTableInvalidParamsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(null, null);
    }

}
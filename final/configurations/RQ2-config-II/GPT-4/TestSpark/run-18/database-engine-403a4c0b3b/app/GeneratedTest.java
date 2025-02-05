package app;

import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> myTables = dbApp.getMyTables();
        assertNotNull(myTables);
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
    public void createTableNullArgumentsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, null, null, null, null);
    }

    @Test
    public void insertIntoTableNullArgumentsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable(null, null);
    }

    @Test
    public void updateTableNullArgumentsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable(null, null, null);
    }

    @Test
    public void deleteFromTableNullArgumentsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable(null, null);
    }

    @Test
    public void selectFromTableNullArgumentsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = null;
        String[] strarrOperators = null;
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
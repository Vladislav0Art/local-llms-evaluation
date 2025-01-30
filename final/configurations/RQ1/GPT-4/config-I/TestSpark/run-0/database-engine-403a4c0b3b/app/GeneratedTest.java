package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;

import java.text.ParseException;
import java.util.Hashtable;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbapp = new DBApp();
        assert (dbapp.getMyTables() != null);
    }

    @Test
    public void getReaderTest() {
        DBApp dbapp = new DBApp();
        assert (dbapp.getReader() != null);
    }

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        assert (dbApp.getWriter() != null);
    }

    @Test
    public void createTableEmptyTest() throws DBAppException {
        DBApp dbapp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbapp.createTable("test", "key", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableEmptyTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("test", htblColNameValue);
    }

    @Test
    public void deleteFromTableEmptyTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("test", htblColNameValue);
    }

    @Test
    public void updateTableEmptyTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("test", "key", htblColNameValue);
    }

    @Test
    public void selectFromTableEmptyTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
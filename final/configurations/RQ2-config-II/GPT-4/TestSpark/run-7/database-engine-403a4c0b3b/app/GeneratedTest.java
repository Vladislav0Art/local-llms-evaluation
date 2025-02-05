package app;

import app.DBApp;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;

public class GeneratedTest {

    // Test the initialization. Assumes the 'init' method has no return.

    @Test
    public void initNormalUsageTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void createTableNormalUsageTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("SampleTable", "ClusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableNormalUsageTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("SampleTable", htblColNameValue);
    }

    @Test
    public void updateTableNormalUsageTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("SampleTable", "ClusteringKeyValue", htblColNameValue);
    }

    @Test
    public void deleteFromTableNormalUsageTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("SampleTable", htblColNameValue);
    }

    @Test
    public void selectFromTableNormalUsageTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        String[] strarrOperators = new String[1];
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertNotNull(iterator);
    }

    @Test
    public void getMyTablesNormalUsageTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
    }

    @Test
    public void getReaderNormalUsageTest() {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

    @Test
    public void getWriterNormalUsageTest() {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}
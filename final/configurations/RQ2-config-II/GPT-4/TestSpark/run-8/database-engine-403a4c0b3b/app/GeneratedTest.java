package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        // create a new instance of DBApp class
        DBApp app = new DBApp();
        HashSet<String> result = app.getMyTables();

        // test if the result type is of HashSet<String> class
        Assert.assertTrue(result instanceof HashSet);
    }

    @Test
    public void getReaderTest() {
        // create a new instance of DBApp class
        DBApp app = new DBApp();
        CsvReader result = app.getReader();

        // test if the result type is of CsvReader class
        Assert.assertTrue(result instanceof CsvReader);
    }

    @Test
    public void getWriterTest() {
        // create a new instance of DBApp class
        DBApp app = new DBApp();
        CsvWriter result = app.getWriter();

        // test if the result type is of CsvWriter class
        Assert.assertTrue(result instanceof CsvWriter);
    }

    @Test
    public void initTest() {
        // create a new instance of DBApp class
        DBApp app = new DBApp();

        // testing if the init() runs without exceptions
        app.init();
    }

    @Test
    public void createTableTest() throws DBAppException {
        // create a new instance of DBApp class
        DBApp app = new DBApp();

        // create and initialize the required hashtables
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        // testing if the createTable() method throws an exception when we provide null as strTableName, strClusteringKeyColumn
        app.createTable(null, null, htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        // create a new instance of DBApp class
        DBApp app = new DBApp();

        // create and initialize the required hashtable
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        // testing if the insertIntoTable() method throws an exception when we provide null as strTableName
        app.insertIntoTable(null, htblColNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        // create a new instance of DBApp class
        DBApp app = new DBApp();

        // create and initialize the required hashtable
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        // testing if the updateTable() methods throws an exception when we provide null as strTableName, strClusteringKeyValue
        app.updateTable(null, null, htblColNameValue);
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        // create a new instance of DBApp class
        DBApp app = new DBApp();

        // create and initialize the required hashtable
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        // testing if the deleteFromTable() methods throws an exception when we provide null as strTableName
        app.deleteFromTable(null, htblColNameValue);
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        // create a new instance of DBApp class
        DBApp app = new DBApp();

        // testing if the selectFromTable() methods throws an exception when we provide null as arrSQLTerms, strarrOperators
        app.selectFromTable(null, null);
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void createTableValidInputTest() throws IOException, DBAppException, ParseException {
        DBApp dbApp = new DBApp();
        String strTableName = "TestTable";
        String strClusteringKeyColumn = "id";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameType.put("id", "java.lang.Integer");
        htblColNameMin.put("id", "1");
        htblColNameMax.put("id", "100");
        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        HashSet<String> tables = dbApp.getMyTables();
        assertTrue(tables.contains(strTableName));
    }

    @Test
    public void createTableExistentTableNameTest() throws IOException, DBAppException, ParseException {
        DBApp dbApp = new DBApp();
        String strTableName = "TestTable";
        String strClusteringKeyColumn = "id";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameType.put("id", "java.lang.Integer");
        htblColNameMin.put("id", "1");
        htblColNameMax.put("id", "100");
        dbApp.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        dbApp.createTable(strTableName, strClusteringKeyColumn,
                htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableValidInputTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        dbApp.insertIntoTable("TestTable", htblColNameValue);
    }

    @Test
    public void insertIntoTableInvalidTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        dbApp.insertIntoTable("NonExistentTable", htblColNameValue);
    }

    @Test
    public void updateTableValidInputTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        dbApp.updateTable("TestTable", "1", htblColNameValue);
    }

    @Test
    public void updateTableInvalidTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        dbApp.updateTable("NonExistentTable", "1", htblColNameValue);
    }

    @Test
    public void deleteFromTableValidInputTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        dbApp.insertIntoTable("TestTable", htblColNameValue);
        dbApp.deleteFromTable("TestTable", htblColNameValue);
    }

    @Test
    public void deleteFromTableInvalidTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        dbApp.deleteFromTable("NonExistentTable", htblColNameValue);
    }

}
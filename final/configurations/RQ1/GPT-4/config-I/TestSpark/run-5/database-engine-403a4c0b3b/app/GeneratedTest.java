package app;

import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedTest {

    @Test
    public void createTableAlreadyExistsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("col1", "type1");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("col1", "min1");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("col1", "max1");
        dbApp.createTable("existingTable", "col1", htblColNameType, htblColNameMin, htblColNameMax);
        dbApp.createTable("existingTable", "col1", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables);
    }

    @Test
    public void insertIntoNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("col1", "val1");
        dbApp.insertIntoTable("nonExistingTable", htblColNameValue);
    }

    @Test
    public void updateNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("col1", "val1");
        dbApp.updateTable("nonExistingTable", "1", htblColNameValue);
    }

    @Test
    public void deleteFromNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("col1", "val1");
        dbApp.deleteFromTable("nonExistingTable", htblColNameValue);
    }

    @Test
    public void selectFromTableWithoutTermsTest() {
        DBApp dbApp = new DBApp();
        try {
            assertNull(dbApp.selectFromTable(null, null));
        } catch (DBAppException e) {
            e.printStackTrace();
        }
    }

}
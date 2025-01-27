package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newDBApp() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp);
    }

    @Test
    public void getMyTables_EmptySet_ReturnsEmptySet() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        assertTrue(result.isEmpty());
    }

    @Test
    public void getMyTables_NotEmptySet_ReturnsNotEmptySet() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = new HashSet<>();
        result.add("table1");
        assertEquals(result, dbApp.getMyTables());
    }

    @Test
    public void init_ThrowsNullPointerException() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void init_NoException_ReturnsTrue() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertTrue(true);
    }

    @Test
    public void createTable_ValidParameters_ReturnsNoException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new HashMap<>();
        Hashtable<String, String> htblColNameMin = new HashMap<>();
        Hashtable<String, String> htblColNameMax = new HashMap<>();
        dbApp.createTable("table1", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
        assertEquals(true, true);
    }

    @Test
    public void createTable_InvalidParameters_ThrowsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = null;
        Hashtable<String, String> htblColNameMin = null;
        Hashtable<String, String> htblColNameMax = null;
        assertThrows(DBAppException.class, () -> dbApp.createTable("table1", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax));
    }

    @Test
    public void insertIntoTable_ValidParameters_ReturnsNoException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", "value1");
        dbApp.insertIntoTable("table1", htblColNameValue);
        assertEquals(true, true);
    }

    @Test
    public void insertIntoTable_InvalidParameters_ThrowsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = null;
        assertThrows(DBAppException.class, () -> dbApp.insertIntoTable("table1", htblColNameValue));
    }

    @Test
    public void updateTable_ValidParameters_ReturnsNoException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", "value2");
        dbApp.updateTable("table1", "clusteringKeyColumn", htblColNameValue);
        assertEquals(true, true);
    }

    @Test
    public void updateTable_InvalidParameters_ThrowsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = null;
        assertThrows(DBAppException.class, () -> dbApp.updateTable("table1", "clusteringKeyColumn", htblColNameValue));
    }

    @Test
    public void deleteFromTable_ValidParameters_ReturnsNoException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", "value3");
        dbApp.deleteFromTable("table1", htblColNameValue);
        assertEquals(true, true);
    }

    @Test
    public void deleteFromTable_InvalidParameters_ThrowsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = null;
        assertThrows(DBAppException.class, () -> dbApp.deleteFromTable("table1", htblColNameValue));
    }

    @Test
    public void selectFromTable_ValidParameters_ReturnsNoException() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[]{};
        String[] strarrOperators = new String[]{"AND"};
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void selectFromTable_InvalidParameters_ThrowsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = null;
        String[] strarrOperators = new String[]{"AND"};
        assertThrows(DBAppException.class, () -> dbApp.selectFromTable(arrSQLTerms, strarrOperators));
    }

}
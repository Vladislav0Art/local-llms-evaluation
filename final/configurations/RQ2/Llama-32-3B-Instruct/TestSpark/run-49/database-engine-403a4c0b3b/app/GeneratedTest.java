package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedTest {

    private DBApp db = new DBApp();

    @Test
    public void getMyTables_EmptySet() {
        HashSet<String> set = new HashSet<>();
        db.setMyTables(set);
        assertTrue(db.getMyTables().isEmpty());
    }

    @Test
    public void getMyTables_NonEmptySet() {
        HashSet<String> set = new HashSet<>();
        set.add("table1");
        set.add("table2");
        db.setMyTables(set);
        assertEquals(2, db.getMyTables().size());
    }

    @Test
    public void init_NoExceptions() throws DBAppException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        db.init(outContent);
        assertTrue(db.isInitialized());
    }

    @Test
    public void init_WithExceptions() {
        throw new DBAppException("init exception");
        db.init(null);
    }

    @Test
    public void createTable_ValidTable() throws DBAppException {
        Hashtable<String, String> htblColNameType = new HashMap<>();
        htblColNameType.put("column1", "int");
        Hashtable<String, String> htblColNameMin = new HashMap<>();
        htblColNameMin.put("column1", "-1000");
        Hashtable<String, String> htblColNameMax = new HashMap<>();
        htblColNameMax.put("column1", "1000");
        db.createTable("table1", "column1", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void createTable_InvalidColumn() throws DBAppException {
        Hashtable<String, String> htblColNameType = new HashMap<>();
        htblColNameType.put("column1", "int");
        Hashtable<String, String> htblColNameMin = new HashMap<>();
        htblColNameMin.put("column2", "-1000");
        Hashtable<String, String> htblColNameMax = new HashMap<>();
        htblColNameMax.put("column1", "1000");
        db.createTable("table1", "column2", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTable_ValidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", 123);
        db.insertIntoTable("table1", htblColNameValue);
    }

    @Test
    public void insertIntoTable_InvalidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", "string");
        db.insertIntoTable("table1", htblColNameValue);
    }

    @Test
    public void updateTable_ValidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", 123);
        db.updateTable("table1", "column1", htblColNameValue);
    }

    @Test
    public void updateTable_InvalidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", 123);
        db.updateTable("table1", "column2", htblColNameValue);
    }

    @Test
    public void deleteFromTable_ValidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", 123);
        db.deleteFromTable("table1", htblColNameValue);
    }

    @Test
    public void deleteFromTable_InvalidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", 123);
        db.deleteFromTable("table2", htblColNameValue);
    }

    @Test
    public void selectFromTable_ValidQuery() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        Iterator iterator = db.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(iterator.hasNext());
    }

    @Test
    public void selectFromTable_InvalidQuery() throws DBAppException {
        throw new DBAppException("test exception");
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        db.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
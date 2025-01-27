package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class GeneratedTest {

    private final DBApp db = new DBApp();

    @Test
    public void getMyTables_EmptyDatabase_ReturnsEmptySet() {
        HashSet<String> actual = new HashSet<>();
        assertTrue(actual.isEmpty());
    }

    @Test
    public void getReader_ThrowsIOException() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(bos);
            db.getReader().open(ps, null);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

    @Test
    public void getWriter_ThrowsIOException() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(bos);
            db.getWriter().open(null, ps);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

    @Test
    public void init_NoException_ReturnsTrue() {
        boolean actual = db.init();
        assertTrue(actual);
    }

    @Test
    public void createTable_ValidDataNoException_ReturnsTrue() {
        Hashtable<String, String> htblColNameType = new HashMap<>();
        htblColNameType.put("column1", "type1");
        Hashtable<String, String> htblColNameMin = new HashMap<>();
        htblColNameMin.put("column2", "minValue1");
        Hashtable<String, String> htblColNameMax = new HashMap<>();
        htblColNameMax.put("column3", "maxValue1");
        db.createTable("testTable", "column1", htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(db.init());
    }

    @Test
    public void createTable_InvalidData_ThrowsDBAppException() {
        Hashtable<String, String> htblColNameType = new HashMap<>();
        htblColNameType.put("column1", "type1");
        Hashtable<String, String> htblColNameMin = new HashMap<>();
        htblColNameMin.put("column2", "minValue1");
        Hashtable<String, String> htblColNameMax = new HashMap<>();
        htblColNameMax.put("column3", "maxValue1");
        db.createTable("testTable", "column4", htblColNameType, htblColNameMin, htblColNameMax);
        assertEquals(DBAppException.class, db.createTable("testTable", "column1", htblColNameType, htblColNameMin, htblColNameMax).getClass());
    }

    @Test
    public void insertIntoTable_ValidDataNoException_ReturnsTrue() {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("value1", "value1");
        db.insertIntoTable("testTable", htblColNameValue);
        assertTrue(db.init());
    }

    @Test
    public void insertIntoTable_InvalidData_ThrowsDBAppException() {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("value1", "value2");
        db.insertIntoTable("testTable", htblColNameValue);
        assertEquals(DBAppException.class, db.insertIntoTable("testTable", htblColNameValue).getClass());
    }

    @Test
    public void updateTable_ValidDataNoException_ReturnsTrue() {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("value1", "value1");
        db.updateTable("testTable", "key1", htblColNameValue);
        assertTrue(db.init());
    }

    @Test
    public void updateTable_InvalidData_ThrowsDBAppException() {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("value1", "value2");
        db.updateTable("testTable", "key2", htblColNameValue);
        assertEquals(DBAppException.class, db.updateTable("testTable", "key1", htblColNameValue).getClass());
    }

    @Test
    public void deleteFromTable_ValidDataNoException_ReturnsTrue() {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("value1", "value1");
        db.deleteFromTable("testTable", htblColNameValue);
        assertTrue(db.init());
    }

    @Test
    public void selectFromTable_ValidDataNoException_ReturnsIterator() {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[]{};
        Iterator iterator = db.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(iterator.hasNext());
    }

}
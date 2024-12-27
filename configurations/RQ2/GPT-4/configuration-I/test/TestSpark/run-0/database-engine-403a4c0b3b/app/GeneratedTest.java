package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import sql.SQLTerm;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getMyTables());
        assertTrue(dbApp.getMyTables().getClass() == HashSet.class);
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
    public void createTableInvalidTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, "Column1", null, null, null);
    }

    @Test
    public void insertIntoTableNoTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        dbApp.insertIntoTable(null, values);
    }

    @Test
    public void updateTableNoTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        dbApp.updateTable(null, "1", values);
    }

    @Test
    public void deleteFromTableNoTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        dbApp.deleteFromTable(null, values);
    }

    @Test
    public void selectFromTableTest() {
        try {
            DBApp dbApp = new DBApp();
            SQLTerm[] terms = new SQLTerm[0];
            String[] operators = new String[0];
            Iterator result = dbApp.selectFromTable(terms, operators);
            assertNotNull(result);
        } catch (Exception e) {
            fail("Exception not expected");
        }
    }

}
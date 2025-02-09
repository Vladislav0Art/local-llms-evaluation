package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.HashSet;

import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedTest {

    @Test
    public void DBAppConstructorTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp);
    }

    @Test
    public void getMyTablesEmptyHashSetTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertEquals(0, tables.size());
    }

    @Test
    public void getReaderNotNullTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getReader());
    }

    @Test
    public void getWriterNotNullTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getWriter());
    }

    @Test
    public void createTableRegularInputTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameType.put("id", "integer");
        htblColNameMin.put("id", "1");
        htblColNameMax.put("id", "100");

        dbApp.createTable("TestTable", "id", htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(dbApp.getMyTables().contains("TestTable"));
    }

    @Test
    public void insertIntoTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("NonExistentTable", htblColNameValue);
    }

    @Test
    public void updateTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("NonExistentTable", "", htblColNameValue);
    }

    @Test
    public void deleteFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("NonExistentTable", htblColNameValue);
    }

    @Test
    public void selectFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        String[] strarrOperators = new String[1];
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
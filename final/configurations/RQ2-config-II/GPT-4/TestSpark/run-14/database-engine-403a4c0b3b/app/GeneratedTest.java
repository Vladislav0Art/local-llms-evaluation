package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedTest {

    @Test
    public void createTableNullTableNameTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, "clusterKey", new Hashtable<String, String>(), new Hashtable<String, String>(), new Hashtable<String, String>());
    }

    @Test
    public void insertIntoTableInvalidTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("InvalidTable", new Hashtable<String, Object>());
    }

    @Test
    public void updateTableNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable("NonExistingTable", "clusterKey", new Hashtable<String, Object>());
    }

    @Test
    public void deleteFromTableNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("NonExistingTable", new Hashtable<String, Object>());
    }

    @Test
    public void selectFromTableInvalidOperatorsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] terms = new SQLTerm[1];
        terms[0] = Mockito.mock(SQLTerm.class);
        String[] operators = new String[1];
        operators[0] = "invalid";
        dbApp.selectFromTable(terms, operators);
    }

    @Test
    public void getMyTablesNotNullTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getMyTables());
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

}
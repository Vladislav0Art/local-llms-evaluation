package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertNotNull(dbApp);
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> nameType = new Hashtable<>();
        Hashtable<String, String> nameMin = new Hashtable<>();
        Hashtable<String, String> nameMax = new Hashtable<>();
        nameType.put("id", "int");
        nameMin.put("id", "1");
        nameMax.put("id", "100");

        dbApp.createTable("TestTable", "id", nameType, nameMin, nameMax);
        assertTrue(dbApp.getMyTables().contains("TestTable"));
    }

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValue = new Hashtable<>();
        nameValue.put("id", 1);

        dbApp.insertIntoTable("TestTable", nameValue);
        assertEquals(1, dbApp.getReader().read("TestTable").size());
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValue = new Hashtable<>();
        nameValue.put("id", 2);

        dbApp.updateTable("TestTable", "1", nameValue);
        assertEquals(2, dbApp.getReader().read("TestTable").get(0).get("id"));
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValue = new Hashtable<>();
        nameValue.put("id", 2);

        dbApp.deleteFromTable("TestTable", nameValue);
        assertTrue(dbApp.getReader().read("TestTable").isEmpty());
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] terms = new SQLTerm[1];
        terms[0] = Mockito.mock(SQLTerm.class);

        String[] operators = new String[1];
        operators[0] = "=";

        assertNotNull(dbApp.selectFromTable(terms, operators));
    }

}
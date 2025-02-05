package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedTest {

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        // Just an example. A real implementation requires to have some tables created
        // in order to get a non-empty set.
        HashSet<String> tables = dbApp.getMyTables();
        Assert.assertEquals(new HashSet<String>(), tables);
    }

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getReader());
    }

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        Assert.assertNotNull(dbApp.getWriter());
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void createTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> columns = new Hashtable<>();
        columns.put("ID", "int");
        columns.put("Name", "String");
        dbApp.createTable(null, null, columns, null, null);
    }

    @Test
    public void insertIntoTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        values.put("ID", 1);
        values.put("Name", "test");
        dbApp.insertIntoTable(null, values);
    }

    @Test
    public void updateTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        values.put("ID", 1);
        values.put("Name", "test");
        dbApp.updateTable(null, "ID", values);
    }

    @Test
    public void deleteFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> values = new Hashtable<>();
        values.put("ID", 1);
        values.put("Name", "test");
        dbApp.deleteFromTable(null, values);
    }

    @Test
    public void selectFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] sqlTerms = new SQLTerm[1];
        sqlTerms[0] = Mockito.mock(SQLTerm.class);
        String[] operators = new String[]{"AND"};
        dbApp.selectFromTable(sqlTerms, operators);
    }

}
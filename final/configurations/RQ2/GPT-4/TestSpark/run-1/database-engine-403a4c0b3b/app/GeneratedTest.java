package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        Assert.assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void createTableNullExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, null, null, null, null);
    }

    @Test
    public void createTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> data = new Hashtable<>();
        dbApp.createTable("", "", data, data, data);
    }

    @Test
    public void insertIntoTableNullExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable(null, null);
    }

    @Test
    public void insertIntoTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> data = new Hashtable<>();
        dbApp.insertIntoTable("", data);
    }

    @Test
    public void updateTableNullExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable(null, null, null);
    }

    @Test
    public void updateTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> data = new Hashtable<>();
        dbApp.updateTable("", "", data);
    }

    @Test
    public void deleteFromTableNullExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable(null, null);
    }

    @Test
    public void deleteFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> data = new Hashtable<>();
        dbApp.deleteFromTable("", data);
    }

    @Test
    public void selectFromTableNullExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(null, null);
    }

    @Test
    public void selectFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        String[] operators = {"INVALID"};
        SQLTerm[] sqlTerms = new SQLTerm[1];
        sqlTerms[0] = Mockito.mock(SQLTerm.class);
        dbApp.selectFromTable(sqlTerms, operators);
    }

}
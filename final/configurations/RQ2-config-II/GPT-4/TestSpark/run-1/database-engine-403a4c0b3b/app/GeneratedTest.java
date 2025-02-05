package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import java.util.Hashtable;
import java.util.HashSet;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void getMyTablesNormalFlowTest() {
        DBApp dbApp = new DBApp();
        HashSet<String> tablesNames = dbApp.getMyTables();
    }

    @Test
    public void initNormalFlowTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void createTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> anyTable = new Hashtable<>();
        dbApp.createTable(anyString(), anyString(), anyTable, anyTable, anyTable);
    }

    @Test
    public void createTableExpectsDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> anyTable = null;
        dbApp.createTable(anyString(), anyString(), anyTable, anyTable, anyTable);
    }

    @Test
    public void insertIntoTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> anyTable = new Hashtable<>();
        dbApp.insertIntoTable(anyString(), anyTable);
    }

    @Test
    public void insertIntoTableExpectsDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> anyTable = null;
        dbApp.insertIntoTable(anyString(), anyTable);
    }

    @Test
    public void updateTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> anyTable = new Hashtable<>();
        dbApp.updateTable(anyString(), anyString(), anyTable);
    }

    @Test
    public void updateTableExpectsDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> anyTable = null;
        dbApp.updateTable(anyString(), anyString(), anyTable);
    }

    @Test
    public void deleteFromTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> anyTable = new Hashtable<>();
        dbApp.deleteFromTable(anyString(), anyTable);
    }

    @Test
    public void deleteFromTableExpectsDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> anyTable = null;
        dbApp.deleteFromTable(anyString(), anyTable);
    }

    @Test
    public void selectFromTableNormalFlowTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] sqlTerms = {};
        String[] strArrOperators = {};
        dbApp.selectFromTable(sqlTerms, strArrOperators);
    }

    @Test
    public void selectFromTableExpectsDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] sqlTerms = null;
        String[] strArrOperators = null;
        dbApp.selectFromTable(sqlTerms, strArrOperators);
    }

}
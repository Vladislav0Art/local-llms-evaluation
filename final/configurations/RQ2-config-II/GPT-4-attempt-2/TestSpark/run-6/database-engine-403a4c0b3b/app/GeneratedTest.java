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
    }

    @Test
    public void createTableTest() {
        DBApp dbApp = new DBApp();
        try {
            Hashtable<String, String> htblColNameType = new Hashtable<>();
            Hashtable<String, String> htblColNameMin = new Hashtable<>();
            Hashtable<String, String> htblColNameMax = new Hashtable<>();
            dbApp.createTable("TestTable", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            Assert.fail("createTableTest has failed with exception " + e.getMessage());
        }
    }

    @Test
    public void createTableWithDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = Mockito.mock(Hashtable.class);
        Mockito.when(htblColNameType.size()).thenReturn(11);
        dbApp.createTable("TestTable", "clusteringKey", htblColNameType, new Hashtable<>(), new Hashtable<>());
    }

    @Test
    public void insertIntoTableTest() {
        DBApp dbApp = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            dbApp.insertIntoTable("TestTable", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail("insertIntoTableTest has failed with exception " + e.getMessage());
        }
    }

    @Test
    public void insertIntoTableWithDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = null;
        dbApp.insertIntoTable("TestTable", htblColNameValue);
    }

    @Test
    public void updateTableTest() {
        DBApp dbApp = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            dbApp.updateTable("TestTable", "1", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail("updateTableTest has failed with exception " + e.getMessage());
        }
    }

    @Test
    public void updateTableWithDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = null;
        dbApp.updateTable("TestTable", "1", htblColNameValue);
    }

    @Test
    public void deleteFromTableTest() {
        DBApp dbApp = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            dbApp.deleteFromTable("TestTable", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail("deleteFromTableTest has failed with exception " + e.getMessage());
        }
    }

    @Test
    public void deleteFromTableWithDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = null;
        dbApp.deleteFromTable("TestTable", htblColNameValue);
    }

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = new DBApp();
        try {
            SQLTerm[] arrSQLTerms = new SQLTerm[2];
            dbApp.selectFromTable(arrSQLTerms, new String[]{"AND"});
        } catch (DBAppException e) {
            Assert.fail("selectFromTableTest has failed with exception " + e.getMessage());
        }
    }

    @Test
    public void selectFromTableWithDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = null;
        dbApp.selectFromTable(arrSQLTerms, new String[]{"AND"});
    }

}
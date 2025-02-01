package app;

import app.DBApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DBApp mockDbApp;

    @Test
    public void initTest() {
        // No Exception expected for this test case.
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

    @Test
    public void createTableTest() {
        try {
            Hashtable<String, String> mockhtblColNameType = new Hashtable<>();
            Hashtable<String, String> mockhtblColNameMin = new Hashtable<>();
            Hashtable<String, String> mockhtblColNameMax = new Hashtable<>();

            // No Exception expected for this test case.
            DBApp dbApp = new DBApp();
            dbApp.createTable("tableName", "primaryKey", mockhtblColNameType, mockhtblColNameMin, mockhtblColNameMax);
        } catch (Exception e) {
            fail("Exception " + e);
        }
    }

    @Test
    public void insertIntoTableTest() throws Exception {
        Hashtable<String, Object> mockhtblColNameValue = new Hashtable<>();

        // Exception is expected due to mocking method.
        doThrow(new RuntimeException()).when(mockDbApp).insertIntoTable("table", mockhtblColNameValue);
        mockDbApp.insertIntoTable("table", mockhtblColNameValue);
    }

    @Test
    public void updateTableTest() throws Exception {
        Hashtable<String, Object> mockhtblColNameValue = new Hashtable<>();

        // Exception is expected due to mocking method.
        doThrow(new RuntimeException()).when(mockDbApp).updateTable("table", "1", mockhtblColNameValue);
        mockDbApp.updateTable("table", "1", mockhtblColNameValue);
    }

    @Test
    public void deleteFromTableTest() throws Exception {
        Hashtable<String, Object> mockhtblColNameValue = new Hashtable<>();

        // Exception is expected due to mocking method.
        doThrow(new RuntimeException()).when(mockDbApp).deleteFromTable("table", mockhtblColNameValue);
        mockDbApp.deleteFromTable("table", mockhtblColNameValue);
    }

    @Test
    public void selectFromTableTest() throws Exception {
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};

        // No Exception expected for this test case.
        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
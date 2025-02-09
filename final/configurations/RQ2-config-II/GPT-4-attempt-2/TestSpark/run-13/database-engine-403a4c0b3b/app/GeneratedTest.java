package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void createTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> colNameType = new Hashtable<>();
        colNameType.put("Name", "String");
        Hashtable<String, String> colNameMin = new Hashtable<>();
        colNameMin.put("Name", "A");
        Hashtable<String, String> colNameMax = new Hashtable<>();
        colNameMax.put("Name", "Z");

        try {
            dbApp.createTable("Students", "Name", colNameType, colNameMin, colNameMax);
        } catch (DBAppException e) {
            assert (false);
        }
    }

    @Test
    public void insertIntoTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("Name", "John");

        try {
            dbApp.insertIntoTable("Students", colNameValue);
        } catch (DBAppException e) {
            assert (false);
        }
    }

    @Test
    public void updateTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("Name", "Jane");

        try {
            dbApp.updateTable("Students", "John", colNameValue);
        } catch (DBAppException e) {
            assert (false);
        }
    }

    @Test
    public void deleteFromTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("Name", "Jane");

        try {
            dbApp.deleteFromTable("Students", colNameValue);
        } catch (DBAppException e) {
            assert (false);
        }
    }

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        arrSQLTerms[0] = new SQLTerm();
        arrSQLTerms[0].setColumnName("Name");
        arrSQLTerms[0].setOperator("=");
        arrSQLTerms[0].setValue(new Object[]{"John"});
        String[] operators = new String[]{"AND"};

        try {
            Iterator iterator = dbApp.selectFromTable(arrSQLTerms, operators);
            assertNotNull(iterator);
        } catch (DBAppException e) {
            assert (false);
        }
    }

    @Test
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getMyTables());
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

}
package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.junit.Assert.*;

import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp);
        dbApp.init();
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
    public void getMyTablesTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getMyTables());
    }

    @Test
    public void createTableNoKeyColumnTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();
        dbApp.createTable("myTable", "", colNameType, colNameMin, colNameMax);
    }

    @Test
    public void insertIntoTableNotExistTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("myTable", htblColNameValue);
    }

    @Test
    public void updateTableNotExistTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        dbApp.updateTable("myTable", "val1", colNameValue);
    }

    @Test
    public void deleteFromTableNotExistTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        dbApp.deleteFromTable("myTable", colNameValue);
    }

    @Test
    public void selectFromTableInvalidTermTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
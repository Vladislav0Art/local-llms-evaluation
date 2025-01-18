package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

import exceptions.DBAppException;
import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp app = new DBApp();
        app.init();
    }

    @Test
    public void getMyTablesTest() {
        DBApp app = new DBApp();
        app.getMyTables();
    }

    @Test
    public void getReaderTest() {
        DBApp app = new DBApp();
        app.getReader();
    }

    @Test
    public void getWriterTest() {
        DBApp app = new DBApp();
        app.getWriter();
    }

    @Test
    public void createTableWithInvalidArgumentsTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        app.createTable(null, null, htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableWithInvalidArgumentsTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.insertIntoTable(null, htblColNameValue);
    }

    @Test
    public void updateTableWithInvalidArgumentsTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.updateTable(null, null, htblColNameValue);
    }

    @Test
    public void deleteFromTableWithInvalidArgumentsTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        app.deleteFromTable(null, htblColNameValue);
    }

    @Test
    public void selectFromTableWithInvalidArgumentsTest() throws DBAppException {
        DBApp app = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        app.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
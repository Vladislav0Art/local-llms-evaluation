package app;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.mockito.Mockito;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertTrue(dbApp.getMyTables().isEmpty());
    }

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("tableName", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(dbApp.getMyTables().contains("tableName"));
    }

    @Test
    public void insertIntoTableInvalidTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("invalidTable", htblColNameValue);
    }

    @Test
    public void updateTableInvalidTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("invalidTable", "clusteringKeyValue", htblColNameValue);
    }

    @Test
    public void deleteFromTableInvalidTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("invalidTable", htblColNameValue);
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[2];
        arrSQLTerms[0] = Mockito.mock(SQLTerm.class);
        arrSQLTerms[1] = Mockito.mock(SQLTerm.class);
        String[] strarrOperators = new String[1];
        strarrOperators[0] = "AND";
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertNotNull(iterator);
    }

}
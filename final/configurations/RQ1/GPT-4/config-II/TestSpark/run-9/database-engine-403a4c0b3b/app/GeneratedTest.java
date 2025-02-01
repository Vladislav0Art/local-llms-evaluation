package app;

import app.DBApp;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import util.validation.Validator;

import java.io.IOException;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorTest() {
        DBApp dbApp = new DBApp();
        assertEquals(0, dbApp.getMyTables().size());
    }

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertEquals(3, dbApp.getMyTables().size());
    }

    @Test
    public void createTableExceptionTest() throws DBAppException {
        thrown.expect(DBAppException.class);
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("test", "id", htblColNameType, htblColNameMin, htblColNameMax);
    }

    @Test
    public void insertIntoTableExceptionTest() throws DBAppException {
        thrown.expect(DBAppException.class);
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("test", htblColNameValue);
    }

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(DBApp.class);
        Mockito.doNothing().when(dbApp).takeAction(Mockito.any(), Mockito.any(), Mockito.any());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("test", "value", htblColNameValue);
        Mockito.verify(dbApp).takeAction(Mockito.any(), Mockito.any(), Mockito.any());
    }

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(DBApp.class);
        Mockito.doNothing().when(dbApp).takeAction(Mockito.any(), Mockito.any(), Mockito.any());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("test", htblColNameValue);
        Mockito.verify(dbApp).takeAction(Mockito.any(), Mockito.any(), Mockito.any());
    }

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[2];
        arrSQLTerms[0] = new SQLTerm("test", "=", "test");
        arrSQLTerms[1] = new SQLTerm("test1", "!=", "test1");

        String[] strarrOperators = new String[2];
        strarrOperators[0] = "and";
        strarrOperators[1] = "or";
        assertEquals(0, dbApp.selectFromTable(arrSQLTerms, strarrOperators).hasNext());
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedInsertIntoTableWithDBAppExceptionTest {

    @Test
    public void insertIntoTableWithDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = null;
        dbApp.insertIntoTable("TestTable", htblColNameValue);
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedDeleteFromTableWithDBAppExceptionTest {

    @Test
    public void deleteFromTableWithDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = null;
        dbApp.deleteFromTable("TestTable", htblColNameValue);
    }

}
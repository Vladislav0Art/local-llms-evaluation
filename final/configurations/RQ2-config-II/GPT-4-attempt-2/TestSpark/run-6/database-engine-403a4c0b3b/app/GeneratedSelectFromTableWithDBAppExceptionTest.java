package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedSelectFromTableWithDBAppExceptionTest {

    @Test
    public void selectFromTableWithDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = null;
        dbApp.selectFromTable(arrSQLTerms, new String[]{"AND"});
    }

}
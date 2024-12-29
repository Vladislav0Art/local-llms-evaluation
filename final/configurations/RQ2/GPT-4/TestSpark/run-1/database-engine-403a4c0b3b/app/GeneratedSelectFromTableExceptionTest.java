package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedSelectFromTableExceptionTest {

    @Test
    public void selectFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        String[] operators = {"INVALID"};
        SQLTerm[] sqlTerms = new SQLTerm[1];
        sqlTerms[0] = Mockito.mock(SQLTerm.class);
        dbApp.selectFromTable(sqlTerms, operators);
    }

}
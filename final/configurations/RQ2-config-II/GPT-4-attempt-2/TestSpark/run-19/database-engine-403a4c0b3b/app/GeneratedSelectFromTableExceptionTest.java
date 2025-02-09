package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableExceptionTest {

    @Test
    public void selectFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = null;
        String[] strarrOperators = null;

        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
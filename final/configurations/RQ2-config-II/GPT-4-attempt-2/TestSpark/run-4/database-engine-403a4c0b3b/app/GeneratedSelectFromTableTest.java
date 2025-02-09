package app;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.mockito.Mockito;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedSelectFromTableTest {

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
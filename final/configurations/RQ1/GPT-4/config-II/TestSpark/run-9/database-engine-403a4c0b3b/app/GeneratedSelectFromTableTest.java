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

public class GeneratedSelectFromTableTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] terms = new SQLTerm[1];
        terms[0] = Mockito.mock(SQLTerm.class);

        String[] operators = new String[1];
        operators[0] = "=";

        assertNotNull(dbApp.selectFromTable(terms, operators));
    }

}
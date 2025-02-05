package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.io.IOException;
import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = Mockito.spy(DBApp.class);
        SQLTerm[] terms = new SQLTerm[1];
        terms[0] = Mockito.mock(SQLTerm.class);
        String[] operators = new String[1];
        operators[0] = "OR";

        try {
            dbApp.selectFromTable(terms, operators);
        } catch (DBAppException e) {
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }
        Mockito.verify(dbApp, Mockito.times(1)).selectFromTable(terms, operators);
    }

}
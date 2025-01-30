package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbAppSpy = Mockito.spy(DBApp.class);
        SQLTerm[] sqlTerms = new SQLTerm[1];
        sqlTerms[0] = new SQLTerm();
        String[] strarrOperators = new String[1];
        strarrOperators[0] = "OR";
        doThrow(DBAppException.class).when(dbAppSpy).selectFromTable(sqlTerms, strarrOperators);
        dbAppSpy.selectFromTable(sqlTerms, strarrOperators);
    }

}
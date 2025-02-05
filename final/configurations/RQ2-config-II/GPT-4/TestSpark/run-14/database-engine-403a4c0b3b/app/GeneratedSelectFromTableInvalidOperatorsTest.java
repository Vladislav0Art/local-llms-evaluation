package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedSelectFromTableInvalidOperatorsTest {

    @Test
    public void selectFromTableInvalidOperatorsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] terms = new SQLTerm[1];
        terms[0] = Mockito.mock(SQLTerm.class);
        String[] operators = new String[1];
        operators[0] = "invalid";
        dbApp.selectFromTable(terms, operators);
    }

}
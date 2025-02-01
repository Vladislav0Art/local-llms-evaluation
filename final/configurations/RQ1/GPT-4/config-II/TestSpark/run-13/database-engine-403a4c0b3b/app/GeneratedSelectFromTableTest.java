package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp app = new DBApp();
        SQLTerm[] sqlTerms = new SQLTerm[1];
        sqlTerms[0] = new SQLTerm();
        String[] operators = new String[1];
        operators[0] = "AND";
        Iterator iterator = app.selectFromTable(sqlTerms, operators);
        assertNotNull(iterator);
    }

}
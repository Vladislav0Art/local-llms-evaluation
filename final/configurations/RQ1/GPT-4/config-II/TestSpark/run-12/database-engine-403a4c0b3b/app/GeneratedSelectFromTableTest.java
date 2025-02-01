package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws Exception {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[2];
        String[] strarrOperators = new String[1];
        arrSQLTerms[0] = new SQLTerm("table1", "column1", "=", "1");
        arrSQLTerms[1] = new SQLTerm("table1", "column2", "=", "2");
        strarrOperators[0] = "OR";
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
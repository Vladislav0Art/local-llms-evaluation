package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito.*;

import java.util.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};

        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.selectFromTable(arrSQLTerms, strarrOperators));
    }

}
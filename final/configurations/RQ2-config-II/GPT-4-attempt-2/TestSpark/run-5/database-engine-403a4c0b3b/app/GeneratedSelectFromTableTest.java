package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() {
        try {
            DBApp dbApp = new DBApp();
            SQLTerm[] arrSQLTerms = new SQLTerm[0];
            String[] strarrOperators = new String[0];
            assertNotNull(dbApp.selectFromTable(arrSQLTerms, strarrOperators));
        } catch (DBAppException e) {
            fail("Exception not expected here");
        }
    }

}
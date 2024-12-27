package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

public class Generated[DBAppSelectFromTable]

Test {

    @Test
    public void [DBAppSelectFromTable]Test() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        Iterator iterator = mock(Iterator.class);
        when(DBApp.class).selectFromTable(arrSQLTerms, strarrOperators).thenReturn(iterator);
        DBApp dbApp = new DBApp();
        assertEquals(iterator, dbApp.selectFromTable(arrSQLTerms, strarrOperators));
    }

}
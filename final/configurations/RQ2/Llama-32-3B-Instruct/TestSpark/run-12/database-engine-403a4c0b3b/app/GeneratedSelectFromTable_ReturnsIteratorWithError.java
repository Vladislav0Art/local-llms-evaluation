package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSelectFromTable_ReturnsIteratorWithError {

    @Test
    public void selectFromTable_ReturnsIteratorWithError() {
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];

        DBApp dbApp = new DBApp();
        assertTrue(dbApp.selectFromTable(arrSQLTerms, strarrOperators).getClass().equals(DBAppException.class));
    }

}
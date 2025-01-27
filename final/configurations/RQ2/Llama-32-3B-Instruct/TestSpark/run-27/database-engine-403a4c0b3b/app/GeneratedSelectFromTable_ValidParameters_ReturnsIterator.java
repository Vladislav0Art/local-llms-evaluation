package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSelectFromTable_ValidParameters_ReturnsIterator {

    @Test
    public void selectFromTable_ValidParameters_ReturnsIterator() throws DBAppException {
        SQLTerm[] arrSQLTerms = Mockito.mock(SQLTerm[].class);
        String[] strarrOperators = Mockito.mock(String[].class);
        Iterator iteratorMock = Mockito.mock(Iterator.class);
        DBApp app = new DBApp();
        app.init();
        Iterator result = app.selectFromTable(arrSQLTerms, strarrOperators);
        assertEquals(iteratorMock, result);
    }

}
package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSelectFromTable_MockOk_ReturnsOk {

    @Test
    public void selectFromTable_MockOk_ReturnsOk() throws DBAppException {
        SQLTerm[] arrSQLTermsMock = new SQLTerm[0];
        String[] strarrOperatorsMock = new String[0];
        dbApp.selectFromTable(arrSQLTermsMock, strarrOperatorsMock);
    }

}
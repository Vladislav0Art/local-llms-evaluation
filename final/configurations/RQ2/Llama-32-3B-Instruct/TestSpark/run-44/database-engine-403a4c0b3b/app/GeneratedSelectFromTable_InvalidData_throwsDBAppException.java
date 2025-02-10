package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedSelectFromTable_InvalidData_throwsDBAppException {

    @Test
    public void selectFromTable_InvalidData_throwsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        assertThrows(DBAppException.class, () -> dbApp.selectFromTable(arrSQLTerms, strarrOperators));
    }

}
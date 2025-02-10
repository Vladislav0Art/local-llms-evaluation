package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedSelectFromTable_ValidData_noException {

    @Test
    public void selectFromTable_ValidData_noException() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
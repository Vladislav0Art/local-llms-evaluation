package app;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;
import org.junit.Test;

import java.text.ParseException;
import java.util.Hashtable;

public class GeneratedSelectFromTableEmptyTest {

    @Test
    public void selectFromTableEmptyTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
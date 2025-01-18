package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        arrSQLTerms[0] = new SQLTerm("", "", "", "");
        String[] strarrOperators = new String[1];
        strarrOperators[0] = "AND";
        try {
            dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        } catch (DBAppException e) {
            Assert.fail();
        }
    }

}
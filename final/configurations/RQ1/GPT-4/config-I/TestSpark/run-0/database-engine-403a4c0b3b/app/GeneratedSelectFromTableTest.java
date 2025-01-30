package app;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException, ParseException {
        DBApp dbapp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        String[] strarrOperators = new String[1];
        Assert.assertNotNull(dbapp.selectFromTable(arrSQLTerms, strarrOperators));
    }

}
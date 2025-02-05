package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp instance = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[3];
        String[] operators = new String[2];
        instance.selectFromTable(arrSQLTerms, operators);
    }

}
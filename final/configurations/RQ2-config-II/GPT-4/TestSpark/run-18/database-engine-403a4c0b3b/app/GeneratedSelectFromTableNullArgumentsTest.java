package app;

import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import static org.junit.Assert.*;

public class GeneratedSelectFromTableNullArgumentsTest {

    @Test
    public void selectFromTableNullArgumentsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = null;
        String[] strarrOperators = null;
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedSelectFromTable_SimpleSelect {

    @Test
    public void selectFromTable_SimpleSelect() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];

        dbApp.init();
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertFalse(iterator.hasNext());
    }

}
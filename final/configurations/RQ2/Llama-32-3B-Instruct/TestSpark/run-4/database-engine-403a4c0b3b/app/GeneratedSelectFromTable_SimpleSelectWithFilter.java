package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedSelectFromTable_SimpleSelectWithFilter {

    @Test
    public void selectFromTable_SimpleSelectWithFilter() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        SQLTerm[] arrSQLTerms = new SQLTerm[]{new SQLTerm("WHERE id = ?", "Integer")};
        String[] strarrOperators = new String[0];

        dbApp.init();
        Iterator iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(iterator.hasNext());
    }

}
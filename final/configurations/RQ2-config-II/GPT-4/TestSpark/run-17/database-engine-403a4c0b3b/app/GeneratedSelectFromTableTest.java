package app;

import org.junit.Test;

import static org.junit.Assert.*;

import exceptions.DBAppException;

import java.util.Hashtable;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};

        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
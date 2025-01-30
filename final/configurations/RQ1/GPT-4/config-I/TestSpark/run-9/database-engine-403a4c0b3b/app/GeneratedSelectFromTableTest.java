package app;

import app.DBApp;
import app.Action;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.Iterator;

import storage.Table;
import sql.SQLTerm;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = mock(DBApp.class);
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};

        try {
            when(dbApp.selectFromTable(arrSQLTerms, strarrOperators)).thenThrow(
                    new DBAppException("Unexpected error while fetching data")
            );
            dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        } catch (DBAppException e) {
            // Exception has been thrown, the test is passed
        }
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;

public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        arrSQLTerms[0] = new SQLTerm();
        arrSQLTerms[0]._objValue = "1";
        arrSQLTerms[0]._strColumnName = "ID";
        arrSQLTerms[0]._strTableName = "testTable";
        arrSQLTerms[0]._strOperator = "=";

        String[] strarrOperators = new String[0];
        Iterator selected = dbApp.selectFromTable(arrSQLTerms, strarrOperators);

        assertNotNull(selected);
    }

}
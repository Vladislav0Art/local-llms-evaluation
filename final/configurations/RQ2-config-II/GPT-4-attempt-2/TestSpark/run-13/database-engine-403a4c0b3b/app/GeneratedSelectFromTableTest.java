package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectFromTableTest {

    @Test
    public void selectFromTableTest() {
        DBApp dbApp = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[1];
        arrSQLTerms[0] = new SQLTerm();
        arrSQLTerms[0].setColumnName("Name");
        arrSQLTerms[0].setOperator("=");
        arrSQLTerms[0].setValue(new Object[]{"John"});
        String[] operators = new String[]{"AND"};

        try {
            Iterator iterator = dbApp.selectFromTable(arrSQLTerms, operators);
            assertNotNull(iterator);
        } catch (DBAppException e) {
            assert (false);
        }
    }

}
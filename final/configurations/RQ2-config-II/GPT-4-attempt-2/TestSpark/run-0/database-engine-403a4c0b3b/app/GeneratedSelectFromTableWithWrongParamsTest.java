package app;

import app.DBApp;
import app.IDatabase;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class GeneratedSelectFromTableWithWrongParamsTest {

    public static class GetMyTablesTest {

        @Test
        public void selectFromTableWithWrongParamsTest() throws DBAppException {
            DBApp dbApp = new DBApp();
            SQLTerm[] emptySQLTerms = new SQLTerm[0];
            String[] emptyStrings = new String[0];
            dbApp.selectFromTable(emptySQLTerms, emptyStrings);
        }
    }

}
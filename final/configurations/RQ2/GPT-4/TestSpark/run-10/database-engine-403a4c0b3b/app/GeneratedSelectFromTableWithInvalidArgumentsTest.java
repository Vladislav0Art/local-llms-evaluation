package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

import exceptions.DBAppException;
import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectFromTableWithInvalidArgumentsTest {

    @Test
    public void selectFromTableWithInvalidArgumentsTest() throws DBAppException {
        DBApp app = new DBApp();
        SQLTerm[] arrSQLTerms = new SQLTerm[0];
        String[] strarrOperators = new String[0];
        app.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import java.util.Hashtable;
import java.util.HashSet;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectFromTableExpectsDBAppExceptionTest {

    @Test
    public void selectFromTableExpectsDBAppExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        SQLTerm[] sqlTerms = null;
        String[] strArrOperators = null;
        dbApp.selectFromTable(sqlTerms, strArrOperators);
    }

}
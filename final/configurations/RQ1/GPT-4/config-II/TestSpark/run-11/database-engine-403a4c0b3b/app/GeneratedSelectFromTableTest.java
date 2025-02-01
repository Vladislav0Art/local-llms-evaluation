package app;

import app.DBApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectFromTableTest {

    @Mock
    private DBApp mockDbApp;

    @Test
    public void selectFromTableTest() throws Exception {
        SQLTerm[] arrSQLTerms = {};
        String[] strarrOperators = {};

        // No Exception expected for this test case.
        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
    }

}
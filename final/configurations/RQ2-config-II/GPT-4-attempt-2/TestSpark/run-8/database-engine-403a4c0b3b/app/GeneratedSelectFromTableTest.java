package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectFromTableTest {

    @Mock
    DBApp dbApp;

    @Test
    public void selectFromTableTest() throws DBAppException {
        SQLTerm[] arrSQLTerms = new SQLTerm[5];
        String[] strarrOperators = new String[5];

        dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        verify(dbApp, times(1)).selectFromTable(arrSQLTerms, strarrOperators);
    }

}
package app;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(MockitoJUnit4Class.class)
public class GeneratedTestSelectFromTable {

    @Mock
    private IDatabase mockDatabase;

    public Database App() {
        return new DBApp();
    }

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testSelectFromTable() {
        SQLTerm[] arrSQLTerms = {new SQLTerm("SELECT * FROM table"), new SQLTerm("WHERE column = 'value'")};
        String[] strarrOperators = {"AND", "OR"};

        DBApp dbApp = new DBApp();

        Iterator<String> iterator = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(iterator.hasNext());
    }

}
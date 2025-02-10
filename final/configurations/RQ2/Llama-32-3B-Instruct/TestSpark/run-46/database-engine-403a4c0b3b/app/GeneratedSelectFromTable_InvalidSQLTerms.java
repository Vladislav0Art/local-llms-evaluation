package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectFromTable_InvalidSQLTerms {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void selectFromTable_InvalidSQLTerms() {
        DBAppException exception = assertThrows(DBAppException.class, () -> dbApp.selectFromTable(new SQLTerm[0], new String[0]));
        assertTrue(exception.getMessage().contains("Invalid SQL terms"));
    }

}
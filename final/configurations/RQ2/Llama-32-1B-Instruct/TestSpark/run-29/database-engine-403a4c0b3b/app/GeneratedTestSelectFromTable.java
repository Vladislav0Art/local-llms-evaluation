package app;

import app.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestSelectFromTable {

    @Test
    public void testSelectFromTable() {
        DBApp dbApp = new DBApp();
        SQLTerm[] terms = Mockito.mock(SQLTerm[].class);
        String[][] operators = Mockito.mock(String[][].class);
        when(dbApp.getClass().getDeclaredFields()).thenReturn(Arrays.asList(
                "selectFromTable", "init"
        ));
        assertEquals(terms, dbApp.selectFromTable(terms, operators));
    }

}
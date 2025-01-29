package app;

import app.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestCreateTable {

    @Test
    public void testCreateTable() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = Mockito.mock(HashSet.class);
        when(dbApp.getClass().getDeclaredFields()).thenReturn(Arrays.asList(
                "createTable", "init"
        ));
        assertEquals(result, dbApp.createTable("myTable", null, null, null, null));
    }

}
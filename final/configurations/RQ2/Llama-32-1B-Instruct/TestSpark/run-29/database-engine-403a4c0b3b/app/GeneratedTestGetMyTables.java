package app;

import app.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetMyTables {

    @Test
    public void testGetMyTables() {
        DBApp dbApp = new DBApp();
        HashSet<String> result = dbApp.getMyTables();
        Mockito.when(dbApp.getClass().getDeclaredFields()).thenReturn(Arrays.asList(
                "getMyTables", "init", "createTable", "insertIntoTable",
                "updateTable", "deleteFromTable"
        ));
        assertEquals(result, new HashSet<>());
    }

}
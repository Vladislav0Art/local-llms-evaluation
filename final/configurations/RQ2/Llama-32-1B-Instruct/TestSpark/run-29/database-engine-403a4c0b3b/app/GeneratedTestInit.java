package app;

import app.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInit {

    @Test
    public void testInit() throws DBAppException {
        DBApp dbApp = new DBApp();
        initMocked(dbApp);
        Mockito.verify(dbApp.getClass().getDeclaredFields()).thenReturn(Arrays.asList(
                "init", "createTable", "insertIntoTable",
                "updateTable", "deleteFromTable"
        ));
        assert (true);
    }

    private void initMocked(DBApp dbApp) {
        Mockito.when(dbApp.getClass().getDeclaredFields()).thenReturn(Arrays.asList(
                "init", "createTable", "insertIntoTable",
                "updateTable", "deleteFromTable"
        ));
        try {
            dbApp.init();
            assert (true);
        } catch (DBAppException e) {
            assert (false);
        }
    }

}
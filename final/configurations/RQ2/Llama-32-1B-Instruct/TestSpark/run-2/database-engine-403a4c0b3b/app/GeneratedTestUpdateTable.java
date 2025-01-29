package app;

import app.DBApp;
import org.junit.jupiter.api.Test;

public class GeneratedTestUpdateTable {

    @Test
    public void testUpdateTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable("testTable", null, null);

        verify(DBApp.getValidator()).getDatabaseName();
        verify(DBApp gettingStorage()).updateTable("testTable", null, null);
    }

}
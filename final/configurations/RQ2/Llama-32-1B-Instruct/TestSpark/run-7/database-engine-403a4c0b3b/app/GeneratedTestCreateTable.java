package app;

import app.DBApp;
import app.DBError;
import app.DBAppException;
import app.TypeCaster;
import app.TypeCasterFactory;
import app.Serializer;
import storage.StorageManager;
import exceptions.DBAppException;
import exceptions.DBAppValidationException;

import java.util.Collections;

import org.junit.Test;

public class GeneratedTestCreateTable {

    @Test
    public void testCreateTable() throws DBAppValidationException, DBAppException {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables, "Expected set not null");

        dbApp.createTable("test", "column1", Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap());
        assertEquals(0, tables.size(), "Expected 0");
    }

}
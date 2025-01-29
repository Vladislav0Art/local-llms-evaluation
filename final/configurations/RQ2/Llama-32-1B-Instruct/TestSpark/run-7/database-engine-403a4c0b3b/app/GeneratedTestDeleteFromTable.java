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

public class GeneratedTestDeleteFromTable {

    @Test
    public void testDeleteFromTable() throws DBAppValidationException {
        DBApp dbApp = new DBApp();
        HashSet<String> tables = dbApp.getMyTables();
        assertNotNull(tables, "Expected set not null");

        HashMap<String, Object> values = new HashMap<>();
        values.put("value1", TypeCasterFactory.getTypes()[0]);
        dbApp.insertIntoTable("test", values);
        dbApp.deleteFromTable("test", values);

        HashSet<String> selectResult = dbApp.selectFromTable(new String[]{"table_name"}, new String[]{"column1"});
        assertEquals(0, selectResult.size(), "Expected 0");
    }

}
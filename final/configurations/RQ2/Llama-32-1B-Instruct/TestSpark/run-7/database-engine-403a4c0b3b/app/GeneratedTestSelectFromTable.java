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

public class GeneratedTestSelectFromTable {

    @Test
    public void testSelectFromTable() {
        DBApp dbApp = new DBApp();
        StorageContext context = new StorageContext();
        StorageManager manager = new StorageManager(context);
        CSVReader reader = new CsvReader(manager.getCSVReader());
        String[] columns = {"column1"};
        HashSet<String> selectResult = dbApp.selectFromTable(reader, columns);

        assertNotNull(selectResult, "Expected not null");
    }

}
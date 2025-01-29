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

public class GeneratedTestGetReader {

    @Test
    public void testGetReader() {
        DBApp dbApp = new DBApp();
        CsvReader csvReader = dbApp.getReader();
        assertNotNull(csvReader, "Expected not null");
    }

}
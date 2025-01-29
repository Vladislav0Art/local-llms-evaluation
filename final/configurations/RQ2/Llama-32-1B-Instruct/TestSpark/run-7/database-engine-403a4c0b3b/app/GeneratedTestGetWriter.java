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

public class GeneratedTestGetWriter {

    @Test
    public void testGetWriter() {
        DBApp dbApp = new DBApp();
        CsvWriter csvWriter = dbApp.getWriter();
        assertNotNull(csvWriter, "Expected not null");
    }

}
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

public class GeneratedTestInit {

    @Test
    public void testInit() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertTrue(dbApp.isValid(), "Expected true");
    }

}
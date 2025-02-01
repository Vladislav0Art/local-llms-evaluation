package app;

import app.DBApp;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import util.validation.Validator;

import java.io.IOException;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

public class GeneratedCreateTableExceptionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void createTableExceptionTest() throws DBAppException {
        thrown.expect(DBAppException.class);
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("test", "id", htblColNameType, htblColNameMin, htblColNameMax);
    }

}
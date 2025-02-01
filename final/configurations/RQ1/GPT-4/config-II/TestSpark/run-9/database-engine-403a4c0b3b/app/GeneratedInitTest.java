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

public class GeneratedInitTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertEquals(3, dbApp.getMyTables().size());
    }

}
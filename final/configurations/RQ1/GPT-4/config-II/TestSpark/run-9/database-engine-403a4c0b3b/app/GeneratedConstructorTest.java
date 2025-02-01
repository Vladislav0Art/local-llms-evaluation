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

public class GeneratedConstructorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorTest() {
        DBApp dbApp = new DBApp();
        assertEquals(0, dbApp.getMyTables().size());
    }

}
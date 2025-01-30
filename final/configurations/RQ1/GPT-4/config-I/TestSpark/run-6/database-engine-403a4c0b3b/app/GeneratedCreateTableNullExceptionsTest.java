package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.text.ParseException;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedCreateTableNullExceptionsTest {

    @Test
    public void createTableNullExceptionsTest() {
        DBApp testApp = new DBApp();
        assertThrows(DBAppException.class, () -> {
            testApp.createTable(null, null, null, null, null);
        });
    }

}
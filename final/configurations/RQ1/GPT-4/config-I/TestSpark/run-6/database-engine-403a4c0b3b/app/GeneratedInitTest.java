package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.text.ParseException;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp testApp = new DBApp();
        testApp.init();
        assertEquals(0, testApp.getMyTables().size());
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp dbApp = new DBApp();
        assertNotNull(dbApp.getWriter());
    }

}
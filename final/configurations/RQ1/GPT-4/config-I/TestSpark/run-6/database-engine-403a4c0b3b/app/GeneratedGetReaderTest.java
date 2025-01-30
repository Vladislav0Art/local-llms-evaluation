package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import storage.Table;
import util.filecontroller.Serializer;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp testApp = new DBApp();
        assertEquals(CsvReader.class, testApp.getReader().getClass());
    }

}
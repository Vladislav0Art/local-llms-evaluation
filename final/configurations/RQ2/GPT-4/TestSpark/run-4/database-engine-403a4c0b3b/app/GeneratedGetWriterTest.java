package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import exceptions.DBAppException;
import org.junit.Test;
import sql.SQLTerm;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

public class GeneratedGetWriterTest {

    @Test
    public void getWriterTest() {
        DBApp app = new DBApp();
        assertTrue(app.getWriter() instanceof CsvWriter);
    }

}
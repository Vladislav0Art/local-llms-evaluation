package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import sql.SQLTerm;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp app = new DBApp();
        assertNotNull("getReader method failed", app.getReader());
    }

}
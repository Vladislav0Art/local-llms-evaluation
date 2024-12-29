package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Test;
import app.DBApp;
import app.IDatabase;
import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedGetReaderTest {

    @Test
    public void getReaderTest() {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

}
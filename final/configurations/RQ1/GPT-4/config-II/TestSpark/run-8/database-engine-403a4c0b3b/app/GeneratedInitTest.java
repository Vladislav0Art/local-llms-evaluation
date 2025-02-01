package app;

import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        // Setup
        final CsvReader reader = Mockito.mock(CsvReader.class);
        final DBApp dbApp = new DBApp();
        dbApp.setReader(reader);

        // Execute
        dbApp.init();

        // Verify
        Mockito.verify(reader).readAllTables();
    }

}
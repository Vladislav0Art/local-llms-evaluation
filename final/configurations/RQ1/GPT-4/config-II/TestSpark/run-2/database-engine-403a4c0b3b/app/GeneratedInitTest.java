package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import storage.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CsvReader reader = Mockito.mock(CsvReader.class);
        DBApp dbApp = new DBApp();
        dbApp.setReader(reader);
        dbApp.init();
        verify(reader, times(1)).readAllTables();
    }

}
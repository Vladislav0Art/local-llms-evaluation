package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;

import exceptions.DBAppException;
import storage.Table;
import util.filecontroller.Serializer;

import static org.mockito.Mockito.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CsvReader reader = mock(CsvReader.class);
        DBApp dbApp = new DBApp();
        dbApp.setReader(reader);
        dbApp.init();
        verify(reader).readAllTables();
    }

}
package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import app.DBApp;
import exceptions.DBAppException;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp app = Mockito.spy(DBApp.class);
        CsvReader reader = Mockito.mock(CsvReader.class);
        Mockito.when(app.getReader()).thenReturn(reader);
        Mockito.when(reader.readAllTables()).thenReturn(new HashSet<>());

        app.init();
        Mockito.verify(reader, Mockito.times(1)).readAllTables();
    }

}
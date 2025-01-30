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

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException, IOException {
        DBApp app = Mockito.spy(DBApp.class);
        CsvWriter writer = Mockito.mock(CsvWriter.class);
        Mockito.when(app.getWriter()).thenReturn(writer);

        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        app.createTable("Students", "id", htblColNameType, htblColNameMin, htblColNameMax);
        Mockito.verify(writer, Mockito.times(1)).write(Mockito.any());
    }

}
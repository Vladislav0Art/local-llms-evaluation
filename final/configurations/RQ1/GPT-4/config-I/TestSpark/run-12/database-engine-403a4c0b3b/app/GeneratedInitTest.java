package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.text.ParseException;
import java.util.Hashtable;
import java.util.HashSet;

import app.DBApp;
import exceptions.DBAppException;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = Mockito.spy(DBApp.class);
        CsvReader reader = Mockito.mock(CsvReader.class);
        HashSet<String> tables = new HashSet<>();
        tables.add("table1");
        tables.add("table2");

        Mockito.when(reader.readAllTables()).thenReturn(tables);
        Mockito.doReturn(reader).when(dbApp).getReader();

        dbApp.init();
        Assert.assertEquals(tables, dbApp.getMyTables());
    }

}
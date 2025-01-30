package app;

import app.DBApp;
import exceptions.DBAppException;
import datamanipulation.CsvWriter;
import datamanipulation.CsvReader;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedTestDeleteTable {

    @Test
    public void testDeleteTable() throws Exception {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("myTable", htblColNameValue);
    }

}
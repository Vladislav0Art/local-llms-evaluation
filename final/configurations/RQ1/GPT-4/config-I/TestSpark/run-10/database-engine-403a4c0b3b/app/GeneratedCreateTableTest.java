package app;

import app.DBApp;
import exceptions.DBAppException;
import datamanipulation.CsvWriter;
import datamanipulation.CsvReader;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("id", "Integer");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("id", "1");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("id", "1000");
        dbApp.createTable("myTable", "id", htblColNameType, htblColNameMin, htblColNameMax);
    }

}
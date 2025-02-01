package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;
import java.io.IOException;
import java.text.ParseException;

import org.mockito.Mockito;
import app.DBApp;
import exceptions.DBAppException;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameType.put("name", "string");
        htblColNameMin.put("name", "A");
        htblColNameMax.put("name", "Z");

        dbApp.createTable("TestTable", "name", htblColNameType, htblColNameMin, htblColNameMax);
        Assert.assertTrue(dbApp.getMyTables().contains("TestTable"));
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedCreateTableInvalidTest {

    @Test
    public void createTableInvalidTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("col1", "String");
        dbApp.createTable("table1", "col1", htblColNameType, htblColNameMin, htblColNameMax);
    }

}
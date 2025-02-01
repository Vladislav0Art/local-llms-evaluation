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

public class GeneratedInsertIntoTableWithoutInitTest {

    @Test
    public void insertIntoTableWithoutInitTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("col1", "value1");
        dbApp.insertIntoTable("table1", htblColNameValue);
    }

}
package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;
import java.io.IOException;
import java.text.ParseException;

import org.mockito.Mockito;
import app.DBApp;
import exceptions.DBAppException;

public class GeneratedInsertIntoTableInvalidTest {

    @Test
    public void insertIntoTableInvalidTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("name", "John");
        dbApp.insertIntoTable("TestTable", htblColNameValue);
    }

}
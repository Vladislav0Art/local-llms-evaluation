package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;

public class GeneratedUpdateTableValidInputTest {

    @Test
    public void updateTableValidInputTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        dbApp.updateTable("TestTable", "1", htblColNameValue);
    }

}
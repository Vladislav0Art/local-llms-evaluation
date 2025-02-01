package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;

public class GeneratedUpdateTableInvalidTableTest {

    @Test
    public void updateTableInvalidTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        dbApp.updateTable("NonExistentTable", "1", htblColNameValue);
    }

}
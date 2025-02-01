package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;

public class GeneratedInsertIntoTableInvalidTableTest {

    @Test
    public void insertIntoTableInvalidTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        dbApp.insertIntoTable("NonExistentTable", htblColNameValue);
    }

}
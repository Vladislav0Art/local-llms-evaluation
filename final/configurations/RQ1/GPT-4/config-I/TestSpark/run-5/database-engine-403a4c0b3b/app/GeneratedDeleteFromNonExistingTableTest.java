package app;

import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedDeleteFromNonExistingTableTest {

    @Test
    public void deleteFromNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("col1", "val1");
        dbApp.deleteFromTable("nonExistingTable", htblColNameValue);
    }

}
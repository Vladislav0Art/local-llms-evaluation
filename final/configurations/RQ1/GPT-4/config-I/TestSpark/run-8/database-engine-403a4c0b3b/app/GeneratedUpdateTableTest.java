package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;

import sql.SQLTerm;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        // Initializing
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("id", 1);

        // Test Update
        dbApp.updateTable("testTable", "1", colNameValue);
    }

}
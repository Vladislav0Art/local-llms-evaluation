package app;

import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Test;
import app.DBApp;
import app.IDatabase;

public class GeneratedTestInsertIntoTable {

    @Test
    public void testInsertIntoTable() {
        DBApp dbApp = new DBApp();
        String strTableName = "testTable";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable(strTableName, htblColNameValue);
    }

}
package app;

import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedCreateTableAlreadyExistsTest {

    @Test
    public void createTableAlreadyExistsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("col1", "type1");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("col1", "min1");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("col1", "max1");
        dbApp.createTable("existingTable", "col1", htblColNameType, htblColNameMin, htblColNameMax);
        dbApp.createTable("existingTable", "col1", htblColNameType, htblColNameMin, htblColNameMax);
    }

}
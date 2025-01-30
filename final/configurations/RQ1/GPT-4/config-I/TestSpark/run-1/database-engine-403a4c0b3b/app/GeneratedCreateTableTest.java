package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;
import util.search.*;

import java.util.Hashtable;
import java.util.Iterator;
import java.io.IOException;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() {
        DBApp dbApp = new DBApp();
        // Setup HTs with the necessary values
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameType.put("id", "int");
        htblColNameMin.put("id", "1");
        htblColNameMax.put("id", "100");
        // Try to create, expect no exception
        try {
            dbApp.createTable("MyTable", "id", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException | IOException e) {
            Assert.fail("Should not have thrown any exception");
        }
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedCreateTableValidTest {

    @Test
    public void createTableValidTest() {
        DBApp app = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("columnName", "String");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("columnName", "0");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("columnName", "100");

        try {
            app.createTable("myTable", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            Assert.fail("Test failed due to DBAppException");
        }
    }

}
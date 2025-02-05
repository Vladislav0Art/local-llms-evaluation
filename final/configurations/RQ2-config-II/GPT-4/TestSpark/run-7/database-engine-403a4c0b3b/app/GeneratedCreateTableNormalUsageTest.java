package app;

import app.DBApp;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;

public class GeneratedCreateTableNormalUsageTest {

    // Test the initialization. Assumes the 'init' method has no return.

    @Test
    public void createTableNormalUsageTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("SampleTable", "ClusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
    }

}
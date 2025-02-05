package app;

import app.DBApp;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;

public class GeneratedUpdateTableNormalUsageTest {

    // Test the initialization. Assumes the 'init' method has no return.

    @Test
    public void updateTableNormalUsageTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("SampleTable", "ClusteringKeyValue", htblColNameValue);
    }

}
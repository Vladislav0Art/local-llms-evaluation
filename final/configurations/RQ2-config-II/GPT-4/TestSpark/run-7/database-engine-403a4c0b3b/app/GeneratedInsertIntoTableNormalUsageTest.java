package app;

import app.DBApp;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;

public class GeneratedInsertIntoTableNormalUsageTest {

    // Test the initialization. Assumes the 'init' method has no return.

    @Test
    public void insertIntoTableNormalUsageTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("SampleTable", htblColNameValue);
    }

}
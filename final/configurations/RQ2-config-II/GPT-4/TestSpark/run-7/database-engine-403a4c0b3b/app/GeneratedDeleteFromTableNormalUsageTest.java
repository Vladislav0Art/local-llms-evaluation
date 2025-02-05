package app;

import app.DBApp;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Hashtable;

public class GeneratedDeleteFromTableNormalUsageTest {

    // Test the initialization. Assumes the 'init' method has no return.

    @Test
    public void deleteFromTableNormalUsageTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("SampleTable", htblColNameValue);
    }

}
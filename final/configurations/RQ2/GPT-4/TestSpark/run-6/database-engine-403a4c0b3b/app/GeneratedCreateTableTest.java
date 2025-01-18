package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        try {
            dbApp.createTable("TestTable", "Key", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (Exception e) {
            Assert.fail("createTableTest failed with exception: " + e);
        }
    }

}
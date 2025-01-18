package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.insertIntoTable("TestTable", htblColNameValue);
        } catch (Exception e) {
            Assert.fail("insertIntoTableTest failed with exception: " + e);
        }
    }

}
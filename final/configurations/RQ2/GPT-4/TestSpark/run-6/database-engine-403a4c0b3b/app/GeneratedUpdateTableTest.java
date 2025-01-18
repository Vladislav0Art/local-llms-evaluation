package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.updateTable("TestTable", "Key", htblColNameValue);
        } catch (Exception e) {
            Assert.fail("updateTableTest failed with exception: " + e);
        }
    }

}
package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        try {
            dbApp.deleteFromTable("TestTable", htblColNameValue);
        } catch (Exception e) {
            Assert.fail("deleteFromTableTest failed with exception: " + e);
        }
    }

}
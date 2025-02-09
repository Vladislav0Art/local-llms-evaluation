package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("testTable", htblColNameValue);

        Assert.assertTrue(true);
    }

}
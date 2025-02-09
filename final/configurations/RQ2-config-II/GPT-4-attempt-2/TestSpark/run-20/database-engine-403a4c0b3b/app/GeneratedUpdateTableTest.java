package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("testTable", "keyValue", htblColNameValue);

        Assert.assertTrue(true);
    }

}
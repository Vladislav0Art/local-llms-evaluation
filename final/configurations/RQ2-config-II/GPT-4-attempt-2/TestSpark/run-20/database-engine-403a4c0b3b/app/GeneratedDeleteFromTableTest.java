package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("testTable", htblColNameValue);

        Assert.assertTrue(true);
    }

}
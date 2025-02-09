package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() {
        DBApp dbApp = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            dbApp.updateTable("TestTable", "1", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail("updateTableTest has failed with exception " + e.getMessage());
        }
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() {
        DBApp dbApp = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            dbApp.deleteFromTable("TestTable", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail("deleteFromTableTest has failed with exception " + e.getMessage());
        }
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() {
        DBApp dbApp = new DBApp();
        try {
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            dbApp.insertIntoTable("TestTable", htblColNameValue);
        } catch (DBAppException e) {
            Assert.fail("insertIntoTableTest has failed with exception " + e.getMessage());
        }
    }

}
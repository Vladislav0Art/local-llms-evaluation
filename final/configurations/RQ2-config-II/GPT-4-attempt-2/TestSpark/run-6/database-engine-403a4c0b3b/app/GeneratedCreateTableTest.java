package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() {
        DBApp dbApp = new DBApp();
        try {
            Hashtable<String, String> htblColNameType = new Hashtable<>();
            Hashtable<String, String> htblColNameMin = new Hashtable<>();
            Hashtable<String, String> htblColNameMax = new Hashtable<>();
            dbApp.createTable("TestTable", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            Assert.fail("createTableTest has failed with exception " + e.getMessage());
        }
    }

}
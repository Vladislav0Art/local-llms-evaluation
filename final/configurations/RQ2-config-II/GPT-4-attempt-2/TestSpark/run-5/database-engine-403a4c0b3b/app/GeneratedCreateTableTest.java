package app;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() {
        try {
            DBApp dbApp = new DBApp();
            Hashtable<String, String> htblColNameType = new Hashtable<>();
            Hashtable<String, String> htblColNameMin = new Hashtable<>();
            Hashtable<String, String> htblColNameMax = new Hashtable<>();
            dbApp.createTable("test", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
        } catch (DBAppException e) {
            fail("Exception not expected here");
        }
    }

}
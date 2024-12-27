package app;

import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

public class GeneratedCreateTableIncorrectParametersTest {

    @Test
    public void createTableIncorrectParametersTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        String tableName = "table1";
        String clusteringKey = "key1";
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();
        dbApp.createTable(tableName, clusteringKey, colNameType, colNameMin, colNameMax);
    }

}
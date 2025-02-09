package app;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.mockito.Mockito;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbApp.createTable("tableName", "clusteringKey", htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(dbApp.getMyTables().contains("tableName"));
    }

}
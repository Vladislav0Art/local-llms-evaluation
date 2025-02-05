package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedCreateTableViolateRulesTest {

    @Test
    public void createTableViolateRulesTest() throws DBAppException {
        String tableName = "TestTable";
        String clusteringKeyColumn = "ID";
        Hashtable<String, String> colNameType = new Hashtable<>();
        colNameType.put("ID", "Int");
        Hashtable<String, String> colNameMin = new Hashtable<>();
        colNameMin.put("ID", "0");
        Hashtable<String, String> colNameMax = new Hashtable<>();
        colNameMax.put("ID", "100");

        DBApp app = new DBApp();
        app.createTable(tableName, clusteringKeyColumn, colNameType, colNameMin, colNameMax);
        // This should throw an exception because of violating some rules
    }

}
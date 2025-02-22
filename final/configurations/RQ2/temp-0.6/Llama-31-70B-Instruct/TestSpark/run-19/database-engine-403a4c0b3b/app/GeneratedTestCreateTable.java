package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import org.junit.Before;
import org.junit.Test;
import app.DBApp;
import app.IDatabase;
import app.exceptions.DBAppException;

public class GeneratedTestCreateTable {

    private IDatabase database;

    @Before
    public void setUp() {
        this.database = new DBApp();
    }

    @Test
    public void testCreateTable() throws DBAppException, ParseException, IOException {
        String strTableName = "table1";
        String strClusteringKeyColumn = "column1";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("column1", "type1");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("column1", "1");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("column1", "10");

        this.database.createTable(strTableName, strClusteringKeyColumn, htblColNameType, htblColNameMin, htblColNameMax);
        assertEquals(new HashSet<>(Arrays.asList("table1")), this.database.getMyTables());
    }

}
package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private DBApp dbApp;

    @BeforeEach
    void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testInit() {
        dbApp.init();

        assertNotNull(dbApp.getMyTables());
        assertEquals(0, dbApp.getMyTables().size());
    }

    @Test
    public void testCreateTable() throws DBAppException {
        String strTableName = "testTable";
        String strClusteringKeyColumn = "keyColumn";
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("col1", "String");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("col1", "0");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("col1", "100");

        dbApp.createTable(
                strTableName,
                strClusteringKeyColumn,
                htblColNameType,
                htblColNameMin,
                htblColNameMax);

        assertEquals(1, dbApp.getMyTables().size());
    }

}
package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCreateTable_ValidParameters_ReturnsNoException {

    @Test
    public void createTable_ValidParameters_ReturnsNoException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new HashMap<>();
        Hashtable<String, String> htblColNameMin = new HashMap<>();
        Hashtable<String, String> htblColNameMax = new HashMap<>();
        dbApp.createTable("table1", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
        assertEquals(true, true);
    }

}
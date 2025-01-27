package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCreateTable_InvalidParameters_ThrowsDBAppException {

    @Test
    public void createTable_InvalidParameters_ThrowsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = null;
        Hashtable<String, String> htblColNameMin = null;
        Hashtable<String, String> htblColNameMax = null;
        assertThrows(DBAppException.class, () -> dbApp.createTable("table1", "clusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax));
    }

}
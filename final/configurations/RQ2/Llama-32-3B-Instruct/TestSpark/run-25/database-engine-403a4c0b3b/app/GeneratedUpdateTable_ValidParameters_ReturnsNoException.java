package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUpdateTable_ValidParameters_ReturnsNoException {

    @Test
    public void updateTable_ValidParameters_ReturnsNoException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", "value2");
        dbApp.updateTable("table1", "clusteringKeyColumn", htblColNameValue);
        assertEquals(true, true);
    }

}
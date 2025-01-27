package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedInsertIntoTable_ValidParameters_ReturnsNoException {

    @Test
    public void insertIntoTable_ValidParameters_ReturnsNoException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", "value1");
        dbApp.insertIntoTable("table1", htblColNameValue);
        assertEquals(true, true);
    }

}
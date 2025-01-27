package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDeleteFromTable_ValidParameters_ReturnsNoException {

    @Test
    public void deleteFromTable_ValidParameters_ReturnsNoException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", "value3");
        dbApp.deleteFromTable("table1", htblColNameValue);
        assertEquals(true, true);
    }

}
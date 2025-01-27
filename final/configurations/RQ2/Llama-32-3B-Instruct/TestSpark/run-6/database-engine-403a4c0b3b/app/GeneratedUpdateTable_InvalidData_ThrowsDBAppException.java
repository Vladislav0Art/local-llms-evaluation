package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class GeneratedUpdateTable_InvalidData_ThrowsDBAppException {

    private final DBApp db = new DBApp();

    @Test
    public void updateTable_InvalidData_ThrowsDBAppException() {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("value1", "value2");
        db.updateTable("testTable", "key2", htblColNameValue);
        assertEquals(DBAppException.class, db.updateTable("testTable", "key1", htblColNameValue).getClass());
    }

}
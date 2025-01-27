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

public class GeneratedCreateTable_InvalidData_ThrowsDBAppException {

    private final DBApp db = new DBApp();

    @Test
    public void createTable_InvalidData_ThrowsDBAppException() {
        Hashtable<String, String> htblColNameType = new HashMap<>();
        htblColNameType.put("column1", "type1");
        Hashtable<String, String> htblColNameMin = new HashMap<>();
        htblColNameMin.put("column2", "minValue1");
        Hashtable<String, String> htblColNameMax = new HashMap<>();
        htblColNameMax.put("column3", "maxValue1");
        db.createTable("testTable", "column4", htblColNameType, htblColNameMin, htblColNameMax);
        assertEquals(DBAppException.class, db.createTable("testTable", "column1", htblColNameType, htblColNameMin, htblColNameMax).getClass());
    }

}
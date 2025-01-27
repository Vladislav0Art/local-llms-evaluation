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

public class GeneratedCreateTable_ValidDataNoException_ReturnsTrue {

    private final DBApp db = new DBApp();

    @Test
    public void createTable_ValidDataNoException_ReturnsTrue() {
        Hashtable<String, String> htblColNameType = new HashMap<>();
        htblColNameType.put("column1", "type1");
        Hashtable<String, String> htblColNameMin = new HashMap<>();
        htblColNameMin.put("column2", "minValue1");
        Hashtable<String, String> htblColNameMax = new HashMap<>();
        htblColNameMax.put("column3", "maxValue1");
        db.createTable("testTable", "column1", htblColNameType, htblColNameMin, htblColNameMax);
        assertTrue(db.init());
    }

}
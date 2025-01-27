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

public class GeneratedDeleteFromTable_ValidDataNoException_ReturnsTrue {

    private final DBApp db = new DBApp();

    @Test
    public void deleteFromTable_ValidDataNoException_ReturnsTrue() {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("value1", "value1");
        db.deleteFromTable("testTable", htblColNameValue);
        assertTrue(db.init());
    }

}
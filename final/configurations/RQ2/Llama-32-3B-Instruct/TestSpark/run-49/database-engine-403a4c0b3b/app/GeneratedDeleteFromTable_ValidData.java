package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedDeleteFromTable_ValidData {

    private DBApp db = new DBApp();

    @Test
    public void deleteFromTable_ValidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", 123);
        db.deleteFromTable("table1", htblColNameValue);
    }

}
package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedInsertIntoTable_InvalidData {

    private DBApp db = new DBApp();

    @Test
    public void insertIntoTable_InvalidData() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new HashMap<>();
        htblColNameValue.put("column1", "string");
        db.insertIntoTable("table1", htblColNameValue);
    }

}
package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedCreateTable_InvalidColumn {

    private DBApp db = new DBApp();

    @Test
    public void createTable_InvalidColumn() throws DBAppException {
        Hashtable<String, String> htblColNameType = new HashMap<>();
        htblColNameType.put("column1", "int");
        Hashtable<String, String> htblColNameMin = new HashMap<>();
        htblColNameMin.put("column2", "-1000");
        Hashtable<String, String> htblColNameMax = new HashMap<>();
        htblColNameMax.put("column1", "1000");
        db.createTable("table1", "column2", htblColNameType, htblColNameMin, htblColNameMax);
    }

}
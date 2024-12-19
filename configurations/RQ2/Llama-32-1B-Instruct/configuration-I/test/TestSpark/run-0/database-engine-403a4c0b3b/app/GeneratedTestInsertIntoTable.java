package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestInsertIntoTable {

    @Test
    public void testInsertIntoTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable("my_table", "column1", null, null, null);
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("value1", 1L);
        dbApp.insertIntoTable("my_table", htblColNameValue);
        assertTrue(!dbApp.getMyTables().contains("my_table"));
    }

}
package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestUpdateTable {

    @Test
    public void testUpdateTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        String strTableName = "my_table";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.createTable(strTableName, null, null, null, null);
        dbApp.updateTable(strTableName, null, htblColNameValue);
        assertFalse(dbApp.getMyTables().contains(strTableName));
    }

}
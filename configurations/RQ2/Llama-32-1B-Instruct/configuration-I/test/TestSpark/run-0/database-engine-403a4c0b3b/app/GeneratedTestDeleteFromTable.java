package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDeleteFromTable {

    @Test
    public void testDeleteFromTable() throws DBAppException {
        DBApp dbApp = new DBApp();
        String strTableName = "my_table";
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.createTable(strTableName, null, null, null, null);
        dbApp.deleteFromTable(strTableName, htblColNameValue);
        assertTrue(!dbApp.getMyTables().contains(strTableName));
    }

}
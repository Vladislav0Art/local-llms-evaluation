package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

public class Generated[DBAppInsertIntoTable]

Test {

    @Test
    public void [DBAppInsertIntoTable]Test() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value1");
        dbApp.init();
        when(DBApp.class).init().thenReturn(null, null);
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("table", htblColNameValue);
    }

}
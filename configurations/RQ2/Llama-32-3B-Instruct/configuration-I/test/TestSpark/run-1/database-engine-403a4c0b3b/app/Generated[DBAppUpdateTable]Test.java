package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

public class Generated[DBAppUpdateTable]

Test {

    @Test
    public void [DBAppUpdateTable]Test() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value2");
        dbApp.init();
        when(DBApp.class).init().thenReturn(null, null);
        DBApp dbApp = new DBApp();
        dbApp.updateTable("table", "key", htblColNameValue);
    }

}
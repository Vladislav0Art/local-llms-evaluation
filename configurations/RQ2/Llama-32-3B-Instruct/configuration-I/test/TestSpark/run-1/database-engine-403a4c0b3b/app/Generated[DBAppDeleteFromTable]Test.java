package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

public class Generated[DBAppDeleteFromTable]

Test {

    @Test
    public void [DBAppDeleteFromTable]Test() throws DBAppException {
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", "value3");
        dbApp.init();
        when(DBApp.class).init().thenReturn(null, null);
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("table", htblColNameValue);
    }

}
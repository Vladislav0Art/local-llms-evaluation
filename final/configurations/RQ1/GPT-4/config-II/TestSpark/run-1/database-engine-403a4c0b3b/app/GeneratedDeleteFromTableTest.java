package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(new DBApp());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.deleteFromTable("tableName", htblColNameValue);
        Mockito.verify(dbApp, Mockito.times(1)).takeAction(Action.DELETE, "tableName", htblColNameValue);
    }

}
package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(new DBApp());
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.updateTable("tableName", "keyValue", htblColNameValue);
        Mockito.verify(dbApp, Mockito.times(1)).takeAction(Action.UPDATE, "tableName", htblColNameValue);
    }

}
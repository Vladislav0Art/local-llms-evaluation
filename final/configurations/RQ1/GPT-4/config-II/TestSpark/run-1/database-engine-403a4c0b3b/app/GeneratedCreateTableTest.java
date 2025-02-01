package app;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = Mockito.spy(new DBApp());
        Hashtable<String, String> hashTable1 = new Hashtable<>();
        Hashtable<String, String> hashTable2 = new Hashtable<>();
        Hashtable<String, String> hashTable3 = new Hashtable<>();
        dbApp.createTable("tableName", "keyColumnName", hashTable1, hashTable2, hashTable3);
        Mockito.verify(dbApp.getWriter(), Mockito.times(1)).write(Mockito.any());
        Assert.assertTrue(dbApp.getMyTables().contains("tableName"));
    }

}
package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

public class Generated[DBAppGetMyTables]

Test {

    @Test
    public void [DBAppGetMyTables]Test() {
        HashSet<String> myTables = new HashSet<>();
        myTables.add("myTable1");
        when(DBApp.class).getMyTables().thenReturn(myTables);
        DBApp dbApp = new DBApp();
        assertEquals(myTables, dbApp.getMyTables());
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbAppSpy = Mockito.spy(DBApp.class);
        Hashtable<String, Object> nonExistingTable = new Hashtable<String, Object>();
        nonExistingTable.put("table", "nonExistingTable");
        doThrow(DBAppException.class).when(dbAppSpy).deleteFromTable("table1", nonExistingTable);
        dbAppSpy.deleteFromTable("table1", nonExistingTable);
    }

}
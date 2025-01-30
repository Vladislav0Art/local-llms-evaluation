package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbAppSpy = Mockito.spy(DBApp.class);
        doThrow(DBAppException.class).when(dbAppSpy).createTable("table1", "col1", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
        dbAppSpy.createTable("table1", "col1", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

}
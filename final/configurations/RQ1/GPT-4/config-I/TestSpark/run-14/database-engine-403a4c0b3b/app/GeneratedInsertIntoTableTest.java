package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbAppSpy = Mockito.spy(DBApp.class);
        doThrow(DBAppException.class).when(dbAppSpy).insertIntoTable("table1", new Hashtable<>());
        dbAppSpy.insertIntoTable("table1", new Hashtable<>());
    }

}
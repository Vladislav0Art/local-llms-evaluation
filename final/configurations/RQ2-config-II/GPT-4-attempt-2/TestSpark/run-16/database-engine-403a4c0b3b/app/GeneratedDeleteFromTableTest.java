package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> nameValue = new Hashtable<>();
        dbApp.deleteFromTable("table1", nameValue); //No output or return, just testing that no exception is thrown.
    }

}
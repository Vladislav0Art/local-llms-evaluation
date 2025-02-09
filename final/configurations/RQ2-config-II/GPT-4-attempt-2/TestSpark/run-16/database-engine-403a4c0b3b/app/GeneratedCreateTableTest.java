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

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> nameType = new Hashtable<>();
        Hashtable<String, String> nameMin = new Hashtable<>();
        Hashtable<String, String> nameMax = new Hashtable<>();
        dbApp.createTable("table1", "Key1", nameType, nameMin, nameMax); //No output or return, just testing that no exception is thrown.
    }

}
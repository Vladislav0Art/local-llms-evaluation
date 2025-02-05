package app;

import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import static org.junit.Assert.*;

public class GeneratedCreateTableNullArgumentsTest {

    @Test
    public void createTableNullArgumentsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, null, null, null, null);
    }

}
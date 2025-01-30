package app;

import app.DBApp;
import app.Action;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Hashtable;
import java.util.Iterator;

import storage.Table;
import sql.SQLTerm;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.getReader().readAllTables();
        dbApp.init();
        assertEquals(dbApp.getReader().readAllTables().size(), dbApp.getMyTables().size());
    }

}
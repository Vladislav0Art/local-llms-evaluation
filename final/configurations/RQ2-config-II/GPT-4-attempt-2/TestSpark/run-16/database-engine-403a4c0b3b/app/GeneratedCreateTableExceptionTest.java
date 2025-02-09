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

public class GeneratedCreateTableExceptionTest {

    @Test
    public void createTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, null, null, null, null);
    }

}
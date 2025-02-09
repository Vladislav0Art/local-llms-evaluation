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

public class GeneratedInsertIntoTableExceptionTest {

    @Test
    public void insertIntoTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable(null, null);
    }

}
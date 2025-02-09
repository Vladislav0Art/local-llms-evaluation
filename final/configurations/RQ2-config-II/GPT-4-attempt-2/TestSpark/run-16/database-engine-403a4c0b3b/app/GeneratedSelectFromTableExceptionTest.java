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

public class GeneratedSelectFromTableExceptionTest {

    @Test
    public void selectFromTableExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(null, null);
    }

}
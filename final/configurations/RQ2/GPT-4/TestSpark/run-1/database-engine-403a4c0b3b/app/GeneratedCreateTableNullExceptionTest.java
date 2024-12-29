package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedCreateTableNullExceptionTest {

    @Test
    public void createTableNullExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, null, null, null, null);
    }

}
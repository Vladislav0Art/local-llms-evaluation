package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedCreateTableNullParamsTest {

    @Test
    public void createTableNullParamsTest() throws DBAppException {
        DBApp databaseApp = new DBApp();
        databaseApp.createTable(null, null, null, null, null);
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedDeleteFromTableNullParamsTest {

    @Test
    public void deleteFromTableNullParamsTest() throws DBAppException {
        DBApp databaseApp = new DBApp();
        databaseApp.deleteFromTable(null, null);
    }

}
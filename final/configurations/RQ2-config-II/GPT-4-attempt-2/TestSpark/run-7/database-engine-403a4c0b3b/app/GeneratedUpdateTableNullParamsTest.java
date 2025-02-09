package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedUpdateTableNullParamsTest {

    @Test
    public void updateTableNullParamsTest() throws DBAppException {
        DBApp databaseApp = new DBApp();
        databaseApp.updateTable(null, null, null);
    }

}
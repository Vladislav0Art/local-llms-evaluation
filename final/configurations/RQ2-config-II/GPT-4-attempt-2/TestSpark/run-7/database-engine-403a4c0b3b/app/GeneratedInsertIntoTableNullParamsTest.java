package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.mockito.Mockito.*;

public class GeneratedInsertIntoTableNullParamsTest {

    @Test
    public void insertIntoTableNullParamsTest() throws DBAppException {
        DBApp databaseApp = new DBApp();
        databaseApp.insertIntoTable(null, null);
    }

}
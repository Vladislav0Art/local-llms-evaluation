package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;

public class GeneratedInsertIntoTableNullExceptionTest {

    @Test
    public void insertIntoTableNullExceptionTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable(null, null);
    }

}
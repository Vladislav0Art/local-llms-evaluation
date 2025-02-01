package app;

import org.junit.Test;
import org.junit.Assert;

import java.util.Hashtable;
import java.io.IOException;
import java.text.ParseException;

import org.mockito.Mockito;
import app.DBApp;
import exceptions.DBAppException;

public class GeneratedCreateTableInvalidTest {

    @Test
    public void createTableInvalidTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.createTable(null, null, null, null, null);
    }

}
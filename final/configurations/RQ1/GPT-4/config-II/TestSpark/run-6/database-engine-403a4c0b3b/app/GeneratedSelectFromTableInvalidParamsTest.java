package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedSelectFromTableInvalidParamsTest {

    @Test
    public void selectFromTableInvalidParamsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.selectFromTable(null, null);
    }

}
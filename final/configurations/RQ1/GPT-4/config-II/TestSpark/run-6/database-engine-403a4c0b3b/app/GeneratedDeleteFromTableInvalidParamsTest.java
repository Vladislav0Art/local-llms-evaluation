package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedDeleteFromTableInvalidParamsTest {

    @Test
    public void deleteFromTableInvalidParamsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<String, Object>();
        dbApp.deleteFromTable("", htblColNameValue);
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedCreateTableInvalidParamsTest {

    @Test
    public void createTableInvalidParamsTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<String, String>();
        Hashtable<String, String> htblColNameMin = new Hashtable<String, String>();
        Hashtable<String, String> htblColNameMax = new Hashtable<String, String>();
        dbApp.createTable("", "", htblColNameType, htblColNameMin, htblColNameMax);
    }

}
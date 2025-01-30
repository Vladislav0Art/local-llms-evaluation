package app;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException, ParseException {
        DBApp dbapp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        dbapp.createTable("testtable", "name", htblColNameType, htblColNameMin, htblColNameMax);
    }

}
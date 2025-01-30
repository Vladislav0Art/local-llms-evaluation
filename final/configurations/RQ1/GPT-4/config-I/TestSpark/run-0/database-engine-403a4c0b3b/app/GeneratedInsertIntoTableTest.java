package app;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException, ParseException {
        DBApp dbapp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbapp.createTable("testtable", "name", htblColNameValue);
    }

}
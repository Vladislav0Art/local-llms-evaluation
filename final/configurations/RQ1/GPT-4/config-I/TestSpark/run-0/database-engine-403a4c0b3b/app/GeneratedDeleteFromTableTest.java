package app;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException, ParseException {
        DBApp dbapp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbapp.deleteFromTable("testtable", htblColNameValue);
    }

}
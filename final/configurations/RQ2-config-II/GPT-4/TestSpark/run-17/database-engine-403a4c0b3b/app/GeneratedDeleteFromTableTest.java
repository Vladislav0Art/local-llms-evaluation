package app;

import org.junit.Test;

import static org.junit.Assert.*;

import exceptions.DBAppException;

import java.util.Hashtable;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", 1);

        dbApp.deleteFromTable("table1", htblColNameValue);
    }

}
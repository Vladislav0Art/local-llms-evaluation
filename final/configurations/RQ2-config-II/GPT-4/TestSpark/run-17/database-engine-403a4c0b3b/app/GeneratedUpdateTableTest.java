package app;

import org.junit.Test;

import static org.junit.Assert.*;

import exceptions.DBAppException;

import java.util.Hashtable;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", 2);

        dbApp.updateTable("table1", "1", htblColNameValue);
    }

}
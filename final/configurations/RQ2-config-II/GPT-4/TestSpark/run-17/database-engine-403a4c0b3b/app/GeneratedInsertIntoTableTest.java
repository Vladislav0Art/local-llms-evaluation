package app;

import org.junit.Test;

import static org.junit.Assert.*;

import exceptions.DBAppException;

import java.util.Hashtable;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("column1", 1);

        dbApp.insertIntoTable("table1", htblColNameValue);
    }

}
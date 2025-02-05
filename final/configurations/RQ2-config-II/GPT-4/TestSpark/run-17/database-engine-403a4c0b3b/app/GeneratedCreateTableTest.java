package app;

import org.junit.Test;

import static org.junit.Assert.*;

import exceptions.DBAppException;

import java.util.Hashtable;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        htblColNameType.put("column1", "int");
        htblColNameMin.put("column1", "1");
        htblColNameMax.put("column1", "100");

        dbApp.createTable("table1", "column1", htblColNameType, htblColNameMin, htblColNameMax);
    }

}
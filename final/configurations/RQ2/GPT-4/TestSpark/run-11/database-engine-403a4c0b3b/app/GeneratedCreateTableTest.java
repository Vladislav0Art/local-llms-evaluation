package app;

import org.junit.Test;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.createTable("testTable", "name", colNameType, colNameMin, colNameMax);
    }

}
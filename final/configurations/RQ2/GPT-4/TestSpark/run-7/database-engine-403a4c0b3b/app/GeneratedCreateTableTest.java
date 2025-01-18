package app;

import org.junit.Test;

import java.util.Hashtable;

import exceptions.DBAppException;
import sql.SQLTerm;

import static org.junit.Assert.*;

public class GeneratedCreateTableTest {

    @Test
    public void createTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> colNameType = new Hashtable<>();
        Hashtable<String, String> colNameMin = new Hashtable<>();
        Hashtable<String, String> colNameMax = new Hashtable<>();
        dbApp.createTable("test", "test", colNameType, colNameMin, colNameMax);
    }

}
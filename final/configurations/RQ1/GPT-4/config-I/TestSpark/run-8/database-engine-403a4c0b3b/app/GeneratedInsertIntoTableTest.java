package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Hashtable;
import java.util.HashSet;

import sql.SQLTerm;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        colNameValue.put("id", 1);

        dbApp.insertIntoTable("testTable", colNameValue);
    }

}
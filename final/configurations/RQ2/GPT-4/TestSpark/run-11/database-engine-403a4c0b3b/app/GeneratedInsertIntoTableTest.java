package app;

import org.junit.Test;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedInsertIntoTableTest {

    @Test
    public void insertIntoTableTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("testTable", colNameValue);
    }

}
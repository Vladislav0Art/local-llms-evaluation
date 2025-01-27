package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedInsertIntoTable_SimpleInsert {

    @Test
    public void insertIntoTable_SimpleInsert() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.init();
        dbApp.insertIntoTable("test", htblColNameValue);
    }

}
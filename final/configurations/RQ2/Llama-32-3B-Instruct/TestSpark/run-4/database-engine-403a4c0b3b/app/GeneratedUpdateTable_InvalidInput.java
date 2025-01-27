package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedUpdateTable_InvalidInput {

    @Test
    public void updateTable_InvalidInput() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.init();
        dbApp.updateTable("test", null, htblColNameValue);
    }

}
package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedUpdateTable_SimpleUpdate {

    @Test
    public void updateTable_SimpleUpdate() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.init();
        dbApp.updateTable("test", "id", htblColNameValue);
    }

}
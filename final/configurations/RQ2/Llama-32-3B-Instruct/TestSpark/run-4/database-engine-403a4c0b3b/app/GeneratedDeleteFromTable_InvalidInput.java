package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedDeleteFromTable_InvalidInput {

    @Test
    public void deleteFromTable_InvalidInput() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.init();
        dbApp.deleteFromTable("test", null);
    }

}
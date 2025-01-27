package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedDeleteFromTable_SimpleDelete {

    @Test
    public void deleteFromTable_SimpleDelete() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();

        dbApp.init();
        dbApp.deleteFromTable("test", htblColNameValue);
    }

}
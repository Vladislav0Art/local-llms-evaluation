package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedCreateTable_InvalidInput {

    @Test
    public void createTable_InvalidInput() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblClusteringKeyColumn = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        dbApp.init();
        dbApp.createTable("test", "id", htblColNameType, htblClusteringKeyColumn, null);
    }

}
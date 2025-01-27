package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import app.DBApp;
import exceptions.DBAppException;

public class GeneratedGetMyTables_SingleTable {

    @Test
    public void getMyTables_SingleTable() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        HashSet<String> result = dbApp.getMyTables();
        assertEquals(1, result.size());
    }

}
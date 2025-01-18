package app;

import org.junit.Test;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedUpdateTableTest {

    @Test
    public void updateTableTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.updateTable("testTable", "1", colNameValue);
    }

}
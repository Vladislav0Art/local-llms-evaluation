package app;

import org.junit.Test;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        Hashtable<String, Object> colNameValue = new Hashtable<>();
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("testTable", colNameValue);
    }

}
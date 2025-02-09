package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import util.sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedUpdateNonExistingTableTest {

    @Test
    public void updateNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.updateTable("testTable", "testKey", new Hashtable<>());
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import util.sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedInsertIntoNonExistingTableTest {

    @Test
    public void insertIntoNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.insertIntoTable("testTable", new Hashtable<>());
    }

}
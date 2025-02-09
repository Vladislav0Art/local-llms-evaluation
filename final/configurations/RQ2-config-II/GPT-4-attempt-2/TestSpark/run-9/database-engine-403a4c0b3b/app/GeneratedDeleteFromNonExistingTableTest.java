package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import util.sql.SQLTerm;

import java.util.HashSet;
import java.util.Hashtable;

public class GeneratedDeleteFromNonExistingTableTest {

    @Test
    public void deleteFromNonExistingTableTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.deleteFromTable("testTable", new Hashtable<>());
    }

}
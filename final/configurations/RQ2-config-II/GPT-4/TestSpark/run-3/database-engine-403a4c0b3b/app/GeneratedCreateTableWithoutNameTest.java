package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedCreateTableWithoutNameTest {

    @Test
    public void createTableWithoutNameTest() throws DBAppException {
        DBApp app = new DBApp();
        app.createTable(null, "key", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

}
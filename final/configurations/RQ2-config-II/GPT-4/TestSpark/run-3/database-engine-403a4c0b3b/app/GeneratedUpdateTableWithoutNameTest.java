package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedUpdateTableWithoutNameTest {

    @Test
    public void updateTableWithoutNameTest() throws DBAppException {
        DBApp app = new DBApp();
        app.updateTable(null, "key", new Hashtable<>());
    }

}
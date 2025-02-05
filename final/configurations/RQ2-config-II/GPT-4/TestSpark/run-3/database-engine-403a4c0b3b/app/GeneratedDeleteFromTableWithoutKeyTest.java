package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedDeleteFromTableWithoutKeyTest {

    @Test
    public void deleteFromTableWithoutKeyTest() throws DBAppException {
        DBApp app = new DBApp();
        app.deleteFromTable("table", new Hashtable<>());
    }

}
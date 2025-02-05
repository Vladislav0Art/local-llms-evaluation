package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import sql.SQLTerm;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class GeneratedInsertIntoTableWithoutNameTest {

    @Test
    public void insertIntoTableWithoutNameTest() throws DBAppException {
        DBApp app = new DBApp();
        app.insertIntoTable(null, new Hashtable<>());
    }

}
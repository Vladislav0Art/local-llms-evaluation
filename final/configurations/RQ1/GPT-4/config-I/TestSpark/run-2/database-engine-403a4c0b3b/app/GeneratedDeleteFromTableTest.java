package app;

import app.*;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

public class GeneratedDeleteFromTableTest {

    @Test
    public void deleteFromTableTest() throws DBAppException {
        DBApp app = new DBApp();
        Hashtable<String, Object> columnValues = new Hashtable<>();
        app.deleteFromTable("table1", columnValues);
    }

}
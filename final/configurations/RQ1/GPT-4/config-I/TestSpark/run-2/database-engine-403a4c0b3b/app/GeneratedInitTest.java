package app;

import app.*;
import exceptions.DBAppException;
import org.junit.Test;

import java.util.HashSet;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp app = new DBApp();
        app.init();
        assertEquals(new HashSet<>(), app.getMyTables());
    }

}
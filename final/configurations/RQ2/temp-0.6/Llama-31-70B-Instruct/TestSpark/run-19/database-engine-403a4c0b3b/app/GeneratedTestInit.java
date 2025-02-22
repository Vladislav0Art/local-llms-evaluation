package app;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import org.junit.Before;
import org.junit.Test;
import app.DBApp;
import app.IDatabase;
import app.exceptions.DBAppException;

public class GeneratedTestInit {

    private IDatabase database;

    @Before
    public void setUp() {
        this.database = new DBApp();
    }

    @Test
    public void testInit() throws DBAppException {
        this.database.init();
        assertEquals(new HashSet<>(), this.database.getMyTables());
    }

}
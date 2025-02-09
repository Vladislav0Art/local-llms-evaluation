package app;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.mockito.Mockito;
import app.DBApp;
import exceptions.DBAppException;
import sql.SQLTerm;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        assertTrue(dbApp.getMyTables().isEmpty());
    }

}
package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Test;
import org.mockito.Mockito;
import sql.SQLTerm;

import java.util.Hashtable;
import java.util.Iterator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init(); //No output or return, just testing that no exception is thrown.
    }

}
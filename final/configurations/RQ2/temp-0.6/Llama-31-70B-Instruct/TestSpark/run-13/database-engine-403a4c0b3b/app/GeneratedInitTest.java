package app;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;
import org.mockito.Mockito;
import app.DBApp;
import app.IDatabase;
import exceptions.DBAppException;
import sql.SQLTerm;
import util.filecontroller.Serializer;
import util.search.Search;

public class GeneratedInitTest {

    @Test
    public void initTest() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.init();
        verify(dbApp).init();
    }

}
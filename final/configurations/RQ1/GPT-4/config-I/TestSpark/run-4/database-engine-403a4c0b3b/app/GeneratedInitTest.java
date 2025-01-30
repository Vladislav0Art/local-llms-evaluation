package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.Iterator;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp app = new DBApp();
        app.getReader().readAllTables();
    }

}
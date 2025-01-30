package app;

import app.DBApp;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import sql.SQLTerm;
import util.search.*;

import java.util.Hashtable;
import java.util.Iterator;
import java.io.IOException;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        // Expect not to throw any exception
    }

}